package kodlamaioDemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.concretes.CategoryManager;
import kodlamaioDemo.business.concretes.CourseManager;
import kodlamaioDemo.business.concretes.InstructorManager;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.core.concretes.DatabaseLogger;
import kodlamaioDemo.core.concretes.FileLogger;
import kodlamaioDemo.core.concretes.MailLogger;
import kodlamaioDemo.dataAccess.concretes.category.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.concretes.course.HibernateCourseDao;
import kodlamaioDemo.dataAccess.concretes.instructor.HibernateInstructorDao;
import kodlamaioDemo.entities.concretes.Category;
import kodlamaioDemo.entities.concretes.Course;
import kodlamaioDemo.entities.concretes.Instructor;

public class Main {

	public static void main(String[] args){
		
		List<Logger> loggers = new ArrayList<Logger>();

        Course course = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı",500);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        
        courseManager.add(course);
        
        System.out.println("-------------------");

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        
        categoryManager.add(new Category(1,"Yazılım"));
        
        System.out.println("-------------------");

        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);
        
        
        
        
        
        
	}

}
