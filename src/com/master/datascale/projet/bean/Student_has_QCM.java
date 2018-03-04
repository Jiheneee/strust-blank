package com.master.datascale.projet.bean;

public class Student_has_QCM {
	
	private Student student;
	private Qcm qcm;
	private int idStudentQCM;
	
	public Student_has_QCM( int idEtudiaUser) {
		super();
		this.setIdStudentQCM(idEtudiaUser);
	}
	
	
	public Student_has_QCM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Qcm getQcm() {
		return qcm;
	}


	public void setQcm(Qcm qcm) {
		this.qcm = qcm;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public int getIdStudentQCM() {
		return idStudentQCM;
	}


	public void setIdStudentQCM(int idStudentQCM) {
		this.idStudentQCM = idStudentQCM;
	}
	
	
}
