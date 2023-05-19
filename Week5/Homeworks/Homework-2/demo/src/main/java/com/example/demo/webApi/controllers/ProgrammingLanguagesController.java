package com.example.demo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ProgrammingLanguageService;
import com.example.demo.business.requests.CreateProgrammingLanguageRequest;
import com.example.demo.business.requests.UpdateProgrammingLannguageRequest;
import com.example.demo.business.responses.GetAllProgrammingLanguagesResponse;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return programmingLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		programmingLanguageService.add(createProgrammingLanguageRequest);
	}
	
	@DeleteMapping("deletebyiid")
	public void delete(@RequestParam int id) {
		programmingLanguageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLannguageRequest updateProgrammingLannguageRequest) {
		programmingLanguageService.update(updateProgrammingLannguageRequest);
	}

	
}
