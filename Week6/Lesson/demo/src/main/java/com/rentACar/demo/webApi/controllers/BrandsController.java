package com.rentACar.demo.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rentACar.demo.business.abstracts.BrandService;
import com.rentACar.demo.business.requests.CreateBrandRequest;
import com.rentACar.demo.business.requests.UpdateBrandRequest;
import com.rentACar.demo.business.responses.GetAllBrandsResponse;
import com.rentACar.demo.business.responses.GetByIdBrandResponse;


@RestController
@RequestMapping("/api/brands")
public class BrandsController {

		private BrandService brandService;

		@Autowired
		public BrandsController(BrandService brandService) {
			this.brandService = brandService;
		}
		
		@GetMapping()
		public List<GetAllBrandsResponse> getAll(){
			
			return brandService.getAll();
		}
		
		@GetMapping("/{id}")
		public GetByIdBrandResponse getById(@PathVariable int id) {
			return null;
			
		}
		
		@PostMapping()
		@ResponseStatus(code = HttpStatus.CREATED)
		public void add(@RequestBody CreateBrandRequest createBrandRequest) {
			this.brandService.add(createBrandRequest);
		}
		
		@PutMapping
		public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
			this.brandService.update(updateBrandRequest);
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable int id) {
			this.brandService.delete(id);
		}
}
