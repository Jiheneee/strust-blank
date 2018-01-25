package com.master.datascale.projet.dao.impl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.master.datascale.projet.bean.Question;
import com.master.datascale.projet.dao.IDAOQuestion;

public class DAOQuestion extends HibernateDaoSupport implements IDAOQuestion {


	public void save(Question t) {
		getHibernateTemplate().save(t);
	}

	
	public void delete(Question t) {
		getHibernateTemplate().delete(t);
	}

	
	public void deleteById(Integer i) {
		delete(findById(i));	
	}

	
	public void update(Question t) {
		getHibernateTemplate().update(t);
	}

	public Question findById(Integer i) {
		return (Question)getHibernateTemplate().get(Question.class, i);
	}

	@SuppressWarnings("unchecked")
	
	public List<Question> getAll(String query) {
		return (List<Question>)getHibernateTemplate().find("from Question");
	}
	

}
