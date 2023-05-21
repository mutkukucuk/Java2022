package com.utku.rentACar.business.rules;

import org.springframework.stereotype.Service;

import com.utku.rentACar.core.utilities.exceptions.BusinessException;
import com.utku.rentACar.dataAccess.abstracts.BrandRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		if (this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists"); //Java exception types
		}
	}
}
