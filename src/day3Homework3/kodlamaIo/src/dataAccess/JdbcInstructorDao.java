package day3Homework3.kodlamaIo.src.dataAccess;

import day3Homework3.kodlamaIo.src.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc'ye eklendi.");
		
	}

}
