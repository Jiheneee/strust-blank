package com.master.datascale.projet.bean;

public class Student_has_QCM_Question {
	
	private Question question;
	private int idQuestionStudentQCM;
	private String storeAnswers;
	private Student_has_QCM studentQcm;

	public Student_has_QCM_Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStoreAnswers() {
		return storeAnswers;
	}


	public void setStoreAnswers(String storeAnswers) {
		this.storeAnswers = storeAnswers;
	}


	public Student_has_QCM_Question(String storeAnswers) {
		super();
		this.storeAnswers = storeAnswers;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Student_has_QCM getStudentQcm() {
		return studentQcm;
	}

	public void setStudentQcm(Student_has_QCM studentQcm) {
		this.studentQcm = studentQcm;
	}

	public int getIdQuestionStudentQCM() {
		return idQuestionStudentQCM;
	}

	public void setIdQuestionStudentQCM(int idQuestionStudentQCM) {
		this.idQuestionStudentQCM = idQuestionStudentQCM;
	}



}
