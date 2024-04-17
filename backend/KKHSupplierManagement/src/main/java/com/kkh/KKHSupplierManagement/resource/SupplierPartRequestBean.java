package com.kkh.KKHSupplierManagement.resource;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class SupplierPartRequestBean {

	@Id
	@GeneratedValue
	Long id;
	Supplier_MasterPart supplier_MasterPart;
	Supplier_Parts supplier_Parts;
	
	public SupplierPartRequestBean(Long id, Supplier_MasterPart savedMasterPart, Supplier_Parts savedPart) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.supplier_MasterPart = savedMasterPart;
		this.supplier_Parts = savedPart;
	}
	
	public SupplierPartRequestBean(SupplierPartRequestBean bean) {
		// TODO Auto-generated constructor stub
		this.id = bean.getId();
		this.supplier_MasterPart = bean.getSupplier_MasterPart();
		this.supplier_Parts = bean.getSupplier_Parts();
	}
	
	public SupplierPartRequestBean() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Supplier_MasterPart getSupplier_MasterPart() {
		return supplier_MasterPart;
	}
	public void setSupplier_MasterPart(Supplier_MasterPart supplier_MasterPart) {
		this.supplier_MasterPart = supplier_MasterPart;
	}
	public Supplier_Parts getSupplier_Parts() {
		return supplier_Parts;
	}
	public void setSupplier_Parts(Supplier_Parts supplier_Parts) {
		this.supplier_Parts = supplier_Parts;
	}
	
}
