package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
	private BrandService brandService;

	//Autowired yasmasakta çalışır
	@Autowired //git parametrelerine bak, uygulamayı tara,kim BrandService imp ediyor -> BrandManagar onun newlenmiş halini bana ver.
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){
	//IoC
		return brandService.getAll();
		
	}
	
}