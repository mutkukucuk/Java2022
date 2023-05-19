package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>{

}
