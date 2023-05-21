package com.utku.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.utku.rentACar.business.abstracts.ModelService;
import com.utku.rentACar.business.dtos.requests.CreateModelRequest;
import com.utku.rentACar.business.dtos.responses.GetAllModelsResponse;
import com.utku.rentACar.core.utilities.mappers.ModelMapperService;
import com.utku.rentACar.dataAccess.abstracts.ModelRepository;
import com.utku.rentACar.entities.concretes.Model;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService{

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetAllModelsResponse> getAll() {
		
		List<Model> models = modelRepository.findAll();
		List<GetAllModelsResponse> modelResponses = models.stream().map(model->this.modelMapperService.forResponse()
				.map(model, GetAllModelsResponse.class)).collect(Collectors.toList());
		return modelResponses;
		
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		
		
		
		modelRepository.save(model);
		
	}

}
