package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.CreateSubTechnologyRequest;
import com.example.demo.business.requests.UpdateSubTechnologyRequest;
import com.example.demo.business.responses.GetAllSubTechnologiesResponse;

public interface SubTechnologyService {
	List<GetAllSubTechnologiesResponse> getAll();
	void add(CreateSubTechnologyRequest createSubTechnologyRequest);
	void delete(int id);
	void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);
	
}
