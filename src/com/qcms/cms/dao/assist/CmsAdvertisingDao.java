package com.qcms.cms.dao.assist;

import java.util.List;

import com.qcms.cms.entity.assist.CmsAdvertising;
import com.qcms.common.hibernate3.Updater;
import com.qcms.common.page.Pagination;

public interface CmsAdvertisingDao {
	public Pagination getPage(Integer siteId, Integer adspaceId,
			Boolean enabled, int pageNo, int pageSize);

	public List<CmsAdvertising> getList(Integer adspaceId, Boolean enabled);

	public CmsAdvertising findById(Integer id);

	public CmsAdvertising save(CmsAdvertising bean);

	public CmsAdvertising updateByUpdater(Updater<CmsAdvertising> updater);

	public CmsAdvertising deleteById(Integer id);
}