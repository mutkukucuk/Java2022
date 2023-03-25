package com.example.coursera.business.concretes;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.coursera.business.abstracts.CourseService;
import com.example.coursera.dataAccess.abstracts.CourseRepository;
import com.example.coursera.entities.concretes.Course;

@Service
public class CourseManager implements CourseService{
	CourseRepository courseRepository;
	//List<Course>coursesArray; 

	public CourseManager() {
	}
	
	@Autowired
	public CourseManager(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
	@Override
	public List<Course> getAll() {
		
		return courseRepository.getAll();
	}

	@Override
	public void add(Course course) throws Exception {

		
		if (course.getName().isEmpty()) {
			throw new Exception("Kurs ismi boş bırakılamaz!");
		}
		
		for (Course course1 : courseRepository.getAll()) {
			if (course1.getName().toUpperCase().equals(course1.getName().toUpperCase())) {
				throw new Exception("Bu kurs sistemde zaten mevcut!");
				
			}
		}
		courseRepository.add(course);
		
		
		
		
	}


	@Override
	public Course getById(int id) {
		
		return courseRepository.getById(id);
	}

	@Override
	public void delete(int id) throws Exception {
		courseRepository.delete(id);
	}

	@Override
	public void update(Course course) {
		courseRepository.update(course);
	}




	
}
