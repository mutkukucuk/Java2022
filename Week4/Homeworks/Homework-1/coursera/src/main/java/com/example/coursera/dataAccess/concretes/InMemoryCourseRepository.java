package com.example.coursera.dataAccess.concretes;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.coursera.dataAccess.abstracts.CourseRepository;
import com.example.coursera.entities.concretes.Course;

@Repository
public class InMemoryCourseRepository implements CourseRepository{
	List<Course> courses;
	
	public InMemoryCourseRepository() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"C#"));
		courses.add(new Course(2,"Java"));
		courses.add(new Course(3,"Python"));
	}

	
	@Override
	public List<Course> getAll() {
		
		return courses;
	}


	@Override
	public void add(Course course) {
		courses.add(course);
		
	}


	@Override
	public void delete(int id) {
		Course courseToRemove = getById(id);
		if (courseToRemove != null) {
			courses.remove(courseToRemove);
		}
	}


	@Override
	public void update(Course course) {
		Course existingCourse = getById(course.getId());
		if (existingCourse != null) {
			existingCourse.setName(course.getName());
		}
		
	}


	@Override
	public Course getById(int id) {
		for (Course course : courses) {
			if (course.getId() == id) {
				return course;
			}
		}
		return null;
	}







	






}

