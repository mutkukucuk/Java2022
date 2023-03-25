package com.example.coursera.dataAccess.abstracts;

import java.util.List;


import com.example.coursera.entities.concretes.Course;

public interface CourseRepository {
	List<Course> getAll();
	void add(Course course);
	void delete(int id);
	void update(Course course);
	Course getById(int id);
}
