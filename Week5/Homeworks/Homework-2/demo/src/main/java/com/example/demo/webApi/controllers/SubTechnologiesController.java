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

import com.example.demo.business.abstracts.SubTechnologyService;
import com.example.demo.business.requests.CreateSubTechnologyRequest;
import com.example.demo.business.requests.UpdateProgrammingLannguageRequest;
import com.example.demo.business.requests.UpdateSubTechnologyRequest;
import com.example.demo.business.responses.GetAllSubTechnologiesResponse;

@RestController
@RequestMapping("api/subtech")
public class SubTechnologiesController {

	
	private SubTechnologyService subTechnologyService;

	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologiesResponse> getAll(){
		return subTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateSubTechnologyRequest createSubTechnologyRequest) {
		subTechnologyService.add(createSubTechnologyRequest);
	}
	
	@DeleteMapping("/deletebyid")
	public void delete(@RequestParam int id) {
		subTechnologyService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateSubTechnologyRequest updateProgrammingLannguageRequest) {
		subTechnologyService.update(updateProgrammingLannguageRequest);
	}
	
	
	
	
}
