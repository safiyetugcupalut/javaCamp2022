package day3Homework3.kodlamaIo.src.dataAccess;

import day3Homework3.kodlamaIo.src.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hibernate'e eklendi.");
		
	}

}
