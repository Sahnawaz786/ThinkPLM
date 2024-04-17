package com.kkh.KKHSupplierManagement.resource;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class KKHSupplierRequestBean {

	
	@Id
	@GeneratedValue
	Long id;
	KKHSupplier_Master kkhsupplier_Master;
	KKHSupplier1 kkhsupplier1;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public KKHSupplier_Master getKkhsupplier_Master() {
		return kkhsupplier_Master;
	}
	public void setKkhsupplier_Master(KKHSupplier_Master kkhsupplier_Master) {
		this.kkhsupplier_Master = kkhsupplier_Master;
	}
	public KKHSupplier1 getKkhsupplier1() {
		return kkhsupplier1;
	}
	public void setKkhsupplier1(KKHSupplier1 kkhsupplier1) {
		this.kkhsupplier1 = kkhsupplier1;
	}
	
	
	public KKHSupplierRequestBean(Long id,KKHSupplier_Master kkhsupplier_Master, KKHSupplier1 kkhsupplier1) {
		super();
		this.id = id;
		this.kkhsupplier_Master = kkhsupplier_Master;
		this.kkhsupplier1 = kkhsupplier1;
	}
	public KKHSupplierRequestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public KKHSupplierRequestBean(KKHSupplierRequestBean bean) {
		// TODO Auto-generated constructor stub
		this.id = bean.getId();
		this.kkhsupplier_Master = bean.getKkhsupplier_Master();
		this.kkhsupplier1 = bean.getKkhsupplier1();
	}
	
}
