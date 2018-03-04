package com.master.datascale.projet.bean;

public class Student_has_QCM {
	
	private Qcm qcm;
	private int idQcm;
	private int idEtudiaUser;
	
	public Student_has_QCM(int idQcm, int idEtudiaUser) {
		super();
		this.idQcm = idQcm;
		this.idEtudiaUser = idEtudiaUser;
	}
	
	
	public Student_has_QCM() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdQcm() {
		return idQcm;
	}
	public void setIdQcm(int idQcm) {
		this.idQcm = idQcm;
	}
	
	public int getIdEtudiaUser() {
		return idEtudiaUser;
	}
	public void setIdEtudiaUser(int idEtudiaUser) {
		this.idEtudiaUser = idEtudiaUser;
	}


	public Qcm getQcm() {
		return qcm;
	}


	public void setQcm(Qcm qcm) {
		this.qcm = qcm;
	}
	
	
}
