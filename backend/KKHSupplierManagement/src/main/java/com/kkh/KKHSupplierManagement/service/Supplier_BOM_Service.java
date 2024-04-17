package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Supplier_BOM;


public interface Supplier_BOM_Service {

	
public Supplier_BOM addSupplier_BOM(Supplier_BOM supplier_bom);
	
	public List<Supplier_BOM> getSupplier_BOM();
	
	public Supplier_BOM  getSupplier_BOM(Long part_number);
	
	public Supplier_BOM updateSupplier_BOM(Supplier_BOM supplier_bom);
	
	public HttpStatus deleteSupplier_BOM(Long parseLong);
	
}
