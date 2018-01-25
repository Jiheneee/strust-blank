package com.master.datascale.projet.dao.impl;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.master.datascale.projet.bean.Teacher;
import com.master.datascale.projet.dao.IDAOTeacher;

public class DAOTeacher extends HibernateDaoSupport implements IDAOTeacher{
	
	
	public void save(Teacher t) {
		getHibernateTemplate().save(t);
	}

	
	public void delete(Teacher t) {
		getHibernateTemplate().delete(t);
	}

	
	public void deleteById(Integer i) {
		delete(findById(i));	
	}

	public void update(Teacher t) {
		getHibernateTemplate().update(t);
	}

	
	public Teacher findById(Integer i) {
		return (Teacher)getHibernateTemplate().get(Teacher.class, i);
	}

	@SuppressWarnings("unchecked")
	
	public List<Teacher> getAll(String query) {
		return (List<Teacher>)getHibernateTemplate().find("from Teacher");
	}
}
