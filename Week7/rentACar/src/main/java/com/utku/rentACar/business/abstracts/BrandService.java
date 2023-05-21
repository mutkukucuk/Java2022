package com.utku.rentACar.business.abstracts;

import java.util.List;

import com.utku.rentACar.business.dtos.requests.CreateBrandRequest;
import com.utku.rentACar.business.dtos.requests.UpdateBrandRequest;
import com.utku.rentACar.business.dtos.responses.GetAllBrandResponse;
import com.utku.rentACar.business.dtos.responses.GetByIdBrandResponse;

public interface BrandService {

	List<GetAllBrandResponse> getAll();
	
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void delete(int id);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	
}
