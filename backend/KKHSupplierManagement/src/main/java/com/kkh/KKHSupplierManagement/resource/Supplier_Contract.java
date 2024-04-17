package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Supplier_Contract {

	
	private String document_name;
	@Id
	@GeneratedValue
	private Long document_number;
	private String supplier_name; 
	private String supplier_category;
	private Date effective_date;
	private Date expiration_date;
	private String work_scope;
	private String pricing_payment;
	private String term_termination;
	private String law_jursidiction;
	private String signatures;
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Long getDocument_number() {
		return document_number;
	}
	public void setDocument_number(Long document_number) {
		this.document_number = document_number;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getSupplier_category() {
		return supplier_category;
	}
	public void setSupplier_category(String supplier_category) {
		this.supplier_category = supplier_category;
	}
	public Date getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getWork_scope() {
		return work_scope;
	}
	public void setWork_scope(String work_scope) {
		this.work_scope = work_scope;
	}
	public String getPricing_payment() {
		return pricing_payment;
	}
	public void setPricing_payment(String pricing_payment) {
		this.pricing_payment = pricing_payment;
	}
	public String getTerm_termination() {
		return term_termination;
	}
	public void setTerm_termination(String term_termination) {
		this.term_termination = term_termination;
	}
	public String getLaw_and_Jursidication() {
		return law_jursidiction;
	}
	public void setLaw_and_Jursidication(String law_and_Jursidication) {
		this.law_jursidiction = law_and_Jursidication;
	}
	public String getSignatures() {
		return signatures;
	}
	public void setSignatures(String signatures) {
		this.signatures = signatures;
	}
	public Supplier_Contract(String document_name, Long document_number, String supplier_name, String supplier_category,
			Date effective_date, Date expiration_date, String work_scope, String pricing_payment,
			String term_termination, String law_jursidiction, String signatures) {
		super();
		this.document_name = document_name;
		this.document_number = document_number;
		this.supplier_name = supplier_name;
		this.supplier_category = supplier_category;
		this.effective_date = effective_date;
		this.expiration_date = expiration_date;
		this.work_scope = work_scope;
		this.pricing_payment = pricing_payment;
		this.term_termination = term_termination;
		this.law_jursidiction = law_jursidiction;
		this.signatures = signatures;
	}
	public Supplier_Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Supplier_Contract [document_name=" + document_name + ", document_number=" + document_number
				+ ", supplier_name=" + supplier_name + ", supplier_category=" + supplier_category + ", effective_date="
				+ effective_date + ", expiration_date=" + expiration_date + ", work_scope=" + work_scope
				+ ", pricing_payment=" + pricing_payment + ", term_termination=" + term_termination
				+ ", law_jursidiction=" + law_jursidiction + ", signatures=" + signatures + "]";
	}
	
	
	
	
}
