package kodlamaioDemo.dataAccess.concretes.instructor;

import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile " + instructor.getInstructorName() + " veri tabanina eklendi");		

		
	}

}
