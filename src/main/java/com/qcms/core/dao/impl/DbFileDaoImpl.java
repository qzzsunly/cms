package com.qcms.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.qcms.common.hibernate3.HibernateBaseDao;
import com.qcms.core.dao.DbFileDao;
import com.qcms.core.entity.DbFile;

@Repository
public class DbFileDaoImpl extends HibernateBaseDao<DbFile, String> implements
		DbFileDao {
	public DbFile findById(String id) {
		DbFile entity = get(id);
		return entity;
	}

	public DbFile save(DbFile bean) {
		getSession().save(bean);
		return bean;
	}

	public DbFile deleteById(String id) {
		DbFile entity = super.get(id);
		if (entity != null) {
			getSession().delete(entity);
		}
		return entity;
	}

	@Override
	protected Class<DbFile> getEntityClass() {
		return DbFile.class;
	}
}