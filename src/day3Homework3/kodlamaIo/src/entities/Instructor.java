package day3Homework3.kodlamaIo.src.entities;

public class Instructor {
	private int instructorId;
	private String instructorName;
	private String instructorLastName;
	public Instructor() {
		super();
	}
	public Instructor(int instructorId, String instructorName, String instructorLastName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.instructorLastName = instructorLastName;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getInstructorLastName() {
		return instructorLastName;
	}
	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}
	
	
}
