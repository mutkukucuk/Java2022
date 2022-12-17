package kodlamaioDemo.dataAccess.concretes.course;

import kodlamaioDemo.dataAccess.abstracts.CourseDao;
import kodlamaioDemo.entities.concretes.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile " + course.getCourseName() + " veri tabanina eklendi");		
		
	}


}
