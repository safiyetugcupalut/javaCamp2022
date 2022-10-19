package day3Homework3.kodlamaIo.src;

import java.util.ArrayList;
import java.util.List;

import day3Homework3.kodlamaIo.src.business.CategoryManager;
import day3Homework3.kodlamaIo.src.business.CourseManager;
import day3Homework3.kodlamaIo.src.business.InstructorManager;
import day3Homework3.kodlamaIo.src.dataAccess.HibernateCategoryDao;
import day3Homework3.kodlamaIo.src.dataAccess.HibernateInstructorDao;
import day3Homework3.kodlamaIo.src.dataAccess.JdbcCourseDao;
import day3Homework3.kodlamaIo.src.entities.Category;
import day3Homework3.kodlamaIo.src.entities.Course;
import day3Homework3.kodlamaIo.src.entities.Instructor;
import day3Homework3.kodlamaIo.src.logging.DatabaseLogger;
import day3Homework3.kodlamaIo.src.logging.FileLogger;
import day3Homework3.kodlamaIo.src.logging.Logger;
import day3Homework3.kodlamaIo.src.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category(1, "Programming");

		List<Category> categoryDb = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryDb);
		categoryManager.add(category);

		System.out.println("                        ");

		Course course1 = new Course(1, "Java2022", 100);
		Course course2 = new Course(2, ".NET", 150);
		Course course3 = new Course(3, "JavaScript", 120);
		Course course4 = new Course(4, "Java+React", 200);
		Course course5 = new Course(5, "C#+ANGULAR", 250);

		List<Course> courseDb = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);

		System.out.println("                        ");

		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
