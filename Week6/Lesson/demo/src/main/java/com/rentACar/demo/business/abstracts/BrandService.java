package com.rentACar.demo.business.abstracts;

import java.util.List;

import com.rentACar.demo.business.requests.CreateBrandRequest;
import com.rentACar.demo.business.requests.UpdateBrandRequest;
import com.rentACar.demo.business.responses.GetAllBrandsResponse;
import com.rentACar.demo.business.responses.GetByIdBrandResponse;

public interface BrandService {

	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
	
}
