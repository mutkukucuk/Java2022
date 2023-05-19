package com.example.demo.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ProgrammingLanguageService;
import com.example.demo.business.requests.CreateProgrammingLanguageRequest;
import com.example.demo.business.requests.UpdateProgrammingLannguageRequest;
import com.example.demo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.demo.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.demo.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponses = new ArrayList<>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			programmingLanguagesResponses.add(responseItem);
		}
		
		
		return programmingLanguagesResponses;
		
		
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.deleteById(id);
		
		
	}

	@Override
	public void update(UpdateProgrammingLannguageRequest updateProgrammingLannguageRequest) {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId() == updateProgrammingLannguageRequest.getId()) {
				programmingLanguage.setName(updateProgrammingLannguageRequest.getName());
				programmingLanguageRepository.save(programmingLanguage);
			}
		}
		
	}

}
