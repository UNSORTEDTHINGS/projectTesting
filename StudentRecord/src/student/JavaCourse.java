package student;

import java.util.ArrayList;

public class JavaCourse {
	
	int courseNumber;
	String instructure;
	CCVStudent ccvStudent;
	ArrayList<CCVStudent> students;
	public JavaCourse(int courseNumber, String instructure, CCVStudent ccvStudent, ArrayList<CCVStudent> students) {
		this.courseNumber = courseNumber;
		this.instructure = instructure;
		this.ccvStudent = ccvStudent;
		this.students = students;
	}
	public int getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getInstructure() {
		return instructure;
	}
	public void setInstructure(String instructure) {
		this.instructure = instructure;
	}
	public CCVStudent getCcvStudent() {
		return ccvStudent;
	}
	public void setCcvStudent(CCVStudent ccvStudent) {
		this.ccvStudent = ccvStudent;
	}
	public ArrayList<CCVStudent> getStudents() {
		return students;
	}
	
	protected void lookupFor() {
		
	}
	
	
	
	

}
