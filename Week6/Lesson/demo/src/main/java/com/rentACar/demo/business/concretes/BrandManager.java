package com.rentACar.demo.business.concretes;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rentACar.demo.business.abstracts.BrandService;
import com.rentACar.demo.business.requests.CreateBrandRequest;
import com.rentACar.demo.business.requests.UpdateBrandRequest;
import com.rentACar.demo.business.responses.GetAllBrandsResponse;
import com.rentACar.demo.business.responses.GetByIdBrandResponse;
import com.rentACar.demo.core.utilities.mappers.ModelMapperService;
import com.rentACar.demo.dataAccess.abstracts.BrandRepository;
import com.rentACar.demo.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
	
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;


	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		
		List<GetAllBrandsResponse> brandsResponses = brands.stream()
				.map(brand->this.modelMapperService.forResponse()
						.map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());
		
		return brandsResponses;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		/*Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());*/
		
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		
		brandRepository.save(brand);
		
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		
		GetByIdBrandResponse response 
		= this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		
		return response;
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
		
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}
	

}
