package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Certification_of_Insurance {

	
	private String document_name;
	@Id
	@GeneratedValue
	private Long policy_number;
	private String supplier_name;
	private String insured_party;
	private  String insurance_coverage;
	private Date effective_date;
	private Date expiration_date;
	private String insurance_company;
	private String authorized_signatures;
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Long getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(Long policy_number) {
		this.policy_number = policy_number;
	}

	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getInsured_party() {
		return insured_party;
	}
	public void setInsured_party(String insured_party) {
		this.insured_party = insured_party;
	}
	public String getInsurance_coverage() {
		return insurance_coverage;
	}
	public void setInsurance_coverage(String insurance_coverage) {
		this.insurance_coverage = insurance_coverage;
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
	public String getInsurance_company() {
		return insurance_company;
	}
	public void setInsurance_company(String insurance_company) {
		this.insurance_company = insurance_company;
	}
	public String getAuthorized_signatures() {
		return authorized_signatures;
	}
	public void setAuthorized_signatures(String authorized_signatures) {
		this.authorized_signatures = authorized_signatures;
	}
	public Certification_of_Insurance(String document_name, Long policy_number, String supplier_name,
			String insured_party, String insurance_coverage, Date effective_date, Date expiration_date,
			String insurance_company, String authorized_signatures) {
		this.document_name = document_name;
		this.policy_number = policy_number;
		this.supplier_name = supplier_name;
		this.insured_party = insured_party;
		this.insurance_coverage = insurance_coverage;
		this.effective_date = effective_date;
		this.expiration_date = expiration_date;
		this.insurance_company = insurance_company;
		this.authorized_signatures = authorized_signatures;
	}
	public Certification_of_Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Certification_of_Insurance [document_name=" + document_name + ", policy_number=" + policy_number
				+ ", supplier_name=" + supplier_name + ", insured_party="
				+ insured_party + ", insurance_coverage=" + insurance_coverage + ", effective_date=" + effective_date
				+ ", expiration_date=" + expiration_date + ", insurance_company=" + insurance_company
				+ ", authorized_signatures=" + authorized_signatures + "]";
	}
	
	
	
}
