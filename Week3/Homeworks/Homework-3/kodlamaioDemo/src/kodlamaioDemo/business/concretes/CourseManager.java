package kodlamaioDemo.business.concretes;

import java.util.List; 

import kodlamaioDemo.business.abstracts.CourseService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.CourseDao;
import kodlamaioDemo.entities.concretes.Course;

public class CourseManager implements CourseService{

	
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Course course) {
		boolean status = true;
		for (Course kurs : courses) {
			if (kurs.getCourseName().equals(course.getCourseName())) {
				status = false;
				break;
			}
		}
		if (!status) {
		 
		 System.out.println("This course already exists");
		}
		else {
			courses.add(course);
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
	}
	




}
