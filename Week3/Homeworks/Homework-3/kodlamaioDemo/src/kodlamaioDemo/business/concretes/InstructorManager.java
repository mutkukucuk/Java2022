package kodlamaioDemo.business.concretes;

import java.util.List;  


import kodlamaioDemo.business.abstracts.InstructorService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.InstructorDao;
import kodlamaioDemo.entities.concretes.Instructor;


public class InstructorManager implements InstructorService{
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	private List<Instructor> instructors;
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Instructor instructor){
		boolean status = true;
		for (Instructor egitmen : instructors) {
			if (egitmen.getInstructorName().equals(instructor.getInstructorName())) {
				status = false;
				break;
			}
		}
		if (!status) {
			System.out.println("This instructor already exists");
		}
		else {
			instructors.add(instructor);
			instructorDao.add(instructor);
			
			for (Logger logger : loggers) {
				logger.log(instructor.getInstructorName());
			}
		}
		
		
	}


}
