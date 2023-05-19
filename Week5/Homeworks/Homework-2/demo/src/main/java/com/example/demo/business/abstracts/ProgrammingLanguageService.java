package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.CreateProgrammingLanguageRequest;
import com.example.demo.business.requests.UpdateProgrammingLannguageRequest;
import com.example.demo.business.responses.GetAllProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void delete(int id);
	void update(UpdateProgrammingLannguageRequest updateProgrammingLannguageRequest);
}
