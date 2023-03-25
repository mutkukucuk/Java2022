package com.example.coursera.business.abstracts;

import java.util.List; 

import com.example.coursera.entities.concretes.Course;

public interface CourseService {
	List<Course> getAll();
	void add(Course course) throws Exception;
	void delete(int id) throws Exception;
	void update(Course course);
	Course getById(int id);
	
}
