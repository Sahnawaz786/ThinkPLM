package com.kkh.KKHSupplierManagement.service;

import java.util.List;


import com.kkh.KKHSupplierManagement.resource.PartUsageLink;

public interface PartUsageLink_Service {

	public PartUsageLink addPartUsageLink(PartUsageLink partusagelink);
	
	public List<PartUsageLink> getPartUsageLink();

}
