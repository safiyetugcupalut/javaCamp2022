package day3Homework3.kodlamaIo.src.business;

import day3Homework3.kodlamaIo.src.dataAccess.InstructorDao;
import day3Homework3.kodlamaIo.src.entities.Instructor;
import day3Homework3.kodlamaIo.src.logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorId() + " " + instructor.getInstructorName() + " "
					+ instructor.getInstructorLastName() + "\n");
		}
	}
}
