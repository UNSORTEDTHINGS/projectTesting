package student;

import javax.swing.JTextArea;

public abstract class Person {
	
	String name;
	String Occupation;
	public Person(String name, String occupation) {
		super();
		this.name = name;
		Occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	@Override
	public String toString() {
		return  "NAME :" + name 
				+ "\nOCCUPATION :" 	+ Occupation;
	}
	
	public abstract void Print(JTextArea textArea);

}
