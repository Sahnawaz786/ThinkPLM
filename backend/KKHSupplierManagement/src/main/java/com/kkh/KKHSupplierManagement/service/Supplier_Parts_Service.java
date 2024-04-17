package com.kkh.KKHSupplierManagement.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.PartUsageLink;
import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_PartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;

public interface Supplier_Parts_Service {

	public Supplier_Parts addSupplier_Parts(Supplier_Parts supplier_parts);

	public List<Supplier_Parts> getSupplier_Parts();

	public Supplier_Parts getSupplier_Parts(Long part_number);

	public Supplier_Parts updateSupplier_Parts(Supplier_Parts supplier_parts);

	public HttpStatus deleteSupplier_Parts(Long parseLong);
///
	public SupplierPartRequestBean createSupplier_Part(SupplierPartRequestBean partRequestBean);

	public ArrayList<SupplierPartRequestBean> getSupplierMasterParts();

	public Supplier_MasterPartObject getSupplierMasterPartObjectsById(Long masterId);

	public Supplier_MasterPartObject createSupplier_PartObject(Supplier_MasterPartObject masterPartObject);

	List<Supplier_MasterPartObject> getSupplierMasterPartObjects();

	public Supplier_MasterPartObject updateSupplier_PartObject(Supplier_MasterPartObject masterPartObject);

	Supplier_MasterPartObject getSupplierMasterPartObjectsHistoryById(Long masterId);

	public HttpStatus deleteSupplierMasterPartObject(Long parseLong);
	
	public HttpStatus deleteSupplierPartObjectsHistoryById(Long parseLong);

	public List<Supplier_MasterPartObject> getSupplier_MasterPartObjectBypart_number(String part_number);

}
