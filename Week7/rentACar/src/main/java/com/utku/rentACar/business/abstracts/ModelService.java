package com.utku.rentACar.business.abstracts;

import java.util.List;

import com.utku.rentACar.business.dtos.requests.CreateModelRequest;
import com.utku.rentACar.business.dtos.responses.GetAllModelsResponse;

public interface ModelService {
	
	List<GetAllModelsResponse> getAll();
	void add(CreateModelRequest createModelRequest);

}
