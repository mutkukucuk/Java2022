package kodlamaioDemo.dataAccess.concretes.course;

import kodlamaioDemo.dataAccess.abstracts.CourseDao;
import kodlamaioDemo.entities.concretes.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile " + course.getCourseName() + " veri tabanina eklendi");		

		
	}

}
