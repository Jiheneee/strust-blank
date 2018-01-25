package com.master.datascale.projet.bean;

public class Student extends User {
	private String NumStudent;
	/**
	 * Return the number of the Student
	 * @return 
	 */
	public String getNumStudent() {
		return NumStudent;
	}
	
	/**
	 * 
	 * @param The new value of the number Student
	 */
	public void setNumStudent(String numStudent) {
		NumStudent = numStudent;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Student(int id, String firstname, String surname,String login,String password) {
		super(id, firstname, surname,login,password);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Student [NumStudent=" + NumStudent + "]";
	}
	
}
