package com.example.coursera.wepApi.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.coursera.business.abstracts.CourseService;
import com.example.coursera.entities.concretes.Course;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController 
@RequestMapping("/api/courses")

public class CoursesController {
	private CourseService courseService;

	@Autowired
	public CoursesController(CourseService courseService) {
		this.courseService = courseService;
	}
	@GetMapping("/getall")
	public List<Course> getAll(){
		return courseService.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody Course course) throws Exception {
		courseService.add(course);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) throws Exception {
		courseService.delete(id);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable int id,@RequestBody Course course) {
		course.setId(id);
		courseService.update(course);
	}
	@GetMapping("/{id}")
	public Course getCourseById(@PathVariable int id) {
		return courseService.getById(id);
	}
	
	
	
}
