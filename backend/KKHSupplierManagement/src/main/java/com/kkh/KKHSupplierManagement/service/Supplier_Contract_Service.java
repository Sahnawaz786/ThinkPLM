package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;

public interface Supplier_Contract_Service {

	
	public Supplier_Contract addSupplier_Contract(Supplier_Contract supplier_contract);
	
	public List<Supplier_Contract> getSupplier_contracts();
	
	public Supplier_Contract  getSupplier_Contract(Long document_number);
	
	public Supplier_Contract updateSupplier_Contract(Supplier_Contract supplier_contract);
	
	public HttpStatus deleteSupplier_Contract(Long parseLong);
}
