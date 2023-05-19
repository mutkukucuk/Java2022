package com.example.demo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.SubTechnologyService;
import com.example.demo.business.requests.CreateSubTechnologyRequest;
import com.example.demo.business.requests.UpdateSubTechnologyRequest;
import com.example.demo.business.responses.GetAllSubTechnologiesResponse;
import com.example.demo.dataAccess.abstracts.SubTechnologyRepository;
import com.example.demo.entities.ProgrammingLanguage;
import com.example.demo.entities.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService{
	private SubTechnologyRepository subTechnologyRepository;
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		this.subTechnologyRepository = subTechnologyRepository;
	}

	@Override
	public List<GetAllSubTechnologiesResponse> getAll() {
		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
		List<GetAllSubTechnologiesResponse> subTechnologiesResponses = new ArrayList<>();
		
		for (SubTechnology subTechnology : subTechnologies) {
			GetAllSubTechnologiesResponse responseItem = new GetAllSubTechnologiesResponse();
			responseItem.setId(subTechnology.getId());
			subTechnologiesResponses.add(responseItem);
			
		}

		return subTechnologiesResponses;
	}

	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		SubTechnology subTechnology = new SubTechnology();
		subTechnology.setId(createSubTechnologyRequest.getId());
		subTechnology.setName(createSubTechnologyRequest.getName());
		subTechnologyRepository.save(subTechnology);
		
	}

	@Override
	public void delete(int id) {
		subTechnologyRepository.deleteById(id);
	}

	@Override
	public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {
		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
		for (SubTechnology subTechnology : subTechnologies) {
			if (subTechnology.getId() == updateSubTechnologyRequest.getId()) {
				subTechnology.setId(updateSubTechnologyRequest.getId());
				subTechnology.setName(updateSubTechnologyRequest.getName());
				subTechnologyRepository.save(null);
			}
		}
	}

}
