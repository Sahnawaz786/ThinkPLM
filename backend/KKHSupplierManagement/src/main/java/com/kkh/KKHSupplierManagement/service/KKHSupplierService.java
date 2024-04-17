package com.kkh.KKHSupplierManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierRequestBean;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier_MasterObject;
import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;

public interface KKHSupplierService {

	public KKHSupplier addSupplierDetails(KKHSupplier kkhSupplierBean);

	public List<KKHSupplier> getSuppliers();

	public KKHSupplier getSupplier(Long supplierId);

	public KKHSupplier updateSupplier(KKHSupplier kkhSupplierBean);

	public HttpStatus deleteSupplier(Long parseLong);

	public List<KKHSupplier> getSupplierCategory(String category);

	
	public KKHSupplierRequestBean createSupplier(KKHSupplierRequestBean kkhsupplierRequestBean);

	public ArrayList<KKHSupplierRequestBean> getSupplierMaster();

	public KKHSupplier_MasterObject getKKHSupplierMasterObjectsById(Long masterId);

	public KKHSupplier_MasterObject createSupplier_Object(KKHSupplier_MasterObject kkhsupplier_MasterObject);

	List<KKHSupplier_MasterObject> getKKHSupplier_MasterObject();

	public KKHSupplier_MasterObject updateKKHSupplier_Object(KKHSupplier_MasterObject kkhsupplier_MasterObject);

	KKHSupplier_MasterObject getKKHSupplier_MasterObjectHistoryById(Long masterId);

	public HttpStatus deleteKKHSupplier_MasterObject(Long parseLong);
	
	public HttpStatus deleteKKHSupplier_ObjectHistoryById(Long parseLong);

	public List<KKHSupplier_MasterObject> getKKHSupplier_MasterObjectByname(String name);
}
