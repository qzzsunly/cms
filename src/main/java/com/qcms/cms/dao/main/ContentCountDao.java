package com.qcms.cms.dao.main;

import net.sf.ehcache.Ehcache;

import com.qcms.cms.entity.main.ContentCount;
import com.qcms.common.hibernate3.Updater;

public interface ContentCountDao {
	public int clearCount(boolean week, boolean month);

	public int copyCount();

	public int freshCacheToDB(Ehcache cache);

	public ContentCount findById(Integer id);

	public ContentCount save(ContentCount bean);

	public ContentCount updateByUpdater(Updater<ContentCount> updater);
}