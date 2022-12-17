package kodlamaioDemo.dataAccess.concretes.instructor;

import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile " + instructor.getInstructorName() + " veri tabanina eklendi");		

		
	}

}
