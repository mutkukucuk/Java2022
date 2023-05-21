package com.utku.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.utku.rentACar.business.abstracts.BrandService;
import com.utku.rentACar.business.dtos.requests.CreateBrandRequest;
import com.utku.rentACar.business.dtos.requests.UpdateBrandRequest;
import com.utku.rentACar.business.dtos.responses.GetAllBrandResponse;
import com.utku.rentACar.business.dtos.responses.GetByIdBrandResponse;
import com.utku.rentACar.core.utilities.mappers.ModelMapperService;
import com.utku.rentACar.dataAccess.abstracts.BrandRepository;
import com.utku.rentACar.entities.concretes.Brand;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllBrandResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandResponse> brandResponses = brands.stream().map(brand->this.modelMapperService.forResponse()
				.map(brand, GetAllBrandResponse.class)).collect(Collectors.toList());
		return brandResponses;
	}

	@Override
	public GetByIdBrandResponse getById(int id) {
		Brand brand = this.brandRepository.findById(id).orElseThrow();
		GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);
		return response;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
		brandRepository.save(brand);
		
	}

	@Override
	public void delete(int id) {
		this.brandRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
		this.brandRepository.save(brand);
	}

}
