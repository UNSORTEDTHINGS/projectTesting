package student;

import javax.swing.JTextArea;

public class CCVStudent extends Person{

	int studentID;
	Campus campus;
	
	public CCVStudent(String name,int studentID,Campus campus) {
		super(name, "CCV-STUDENT");
		this.studentID = studentID;
		this.campus= campus;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	
	
	@Override
	public String toString() {
		return "STUDENT ID:" + studentID 
				+"\nCAMPUS :" + campus ;
				
	}

	@Override
	public void Print(JTextArea textArea) {
		// TODO Auto-generated method stub
		
	}

}
