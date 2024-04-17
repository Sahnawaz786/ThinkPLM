package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.PartUsageLinkDao;
import com.kkh.KKHSupplierManagement.resource.PartUsageLink;
import com.kkh.KKHSupplierManagement.service.PartUsageLink_Service;

@Service
public class PartUsageLink_Serviceimpl implements PartUsageLink_Service{

	
@Autowired
 private PartUsageLinkDao partusagelinkDao;
	
	@Override
	public PartUsageLink addPartUsageLink(PartUsageLink partusagelink) {

		partusagelinkDao.save(partusagelink);
		return partusagelink;
	}

	@Override
	public List<PartUsageLink> getPartUsageLink() {

		return this.partusagelinkDao.findAll();
	}

	

}
