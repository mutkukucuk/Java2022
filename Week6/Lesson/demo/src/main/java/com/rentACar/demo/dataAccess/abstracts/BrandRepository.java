package com.rentACar.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rentACar.demo.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
