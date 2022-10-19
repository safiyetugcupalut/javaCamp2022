package day3Homework3.kodlamaIo.src.business;

import java.util.List;

import day3Homework3.kodlamaIo.src.dataAccess.CourseDao;
import day3Homework3.kodlamaIo.src.entities.Course;
import day3Homework3.kodlamaIo.src.logging.Logger;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyati 0'dan kücük olamaz");

		}
		for (Course cours : courses) {
			if (cours.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs adi digerleriyle ayni olamaz ! ");
			}
		}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}

}
