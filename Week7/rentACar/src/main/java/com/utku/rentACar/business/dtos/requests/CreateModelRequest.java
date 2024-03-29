package com.utku.rentACar.business.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {
	@NotNull //required - zorunlu
	@NotBlank //bosluk olmasin
	@Size(min=3, max=20) //uzunluk	
	private String name;
	
	@NotNull
	@NotBlank
	private int brandId;
}
