package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Compliance_Certification {

	private String document_name;
	@Id
	@GeneratedValue
	private Long certification_number;
	private String supplier_name;
	private String compliance_standard;
	private Date certification_date;
	private Date expiration_date;
	private String certifying_authority;
	private String compliance_statement;
	
	
	
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Long getCertification_number() {
		return certification_number;
	}
	public void setCertification_number(Long certification_number) {
		this.certification_number = certification_number;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getCompliance_standard() {
		return compliance_standard;
	}
	public void setCompliance_standard(String compliance_standard) {
		this.compliance_standard = compliance_standard;
	}
	public Date getCertification_date() {
		return certification_date;
	}
	public void setCertification_date(Date certification_date) {
		this.certification_date = certification_date;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getCertifying_authority() {
		return certifying_authority;
	}
	public void setCertifying_authority(String certifying_authority) {
		this.certifying_authority = certifying_authority;
	}
	public String getCompliance_statement() {
		return compliance_statement;
	}
	public void setCompliance_statement(String compliance_statement) {
		this.compliance_statement = compliance_statement;
	}
	public Compliance_Certification(String document_name, Long certification_number, String supplier_name,
			String compliance_standard, Date certification_date, Date expiration_date, String certifying_authority,
			String compliance_statement) {
		this.document_name = document_name;
		this.certification_number = certification_number;
		this.supplier_name = supplier_name;
		this.compliance_standard = compliance_standard;
		this.certification_date = certification_date;
		this.expiration_date = expiration_date;
		this.certifying_authority = certifying_authority;
		this.compliance_statement = compliance_statement;
	}
	public Compliance_Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Compliance_Certification [document_name=" + document_name + ", certification_number="
				+ certification_number + ", supplier_name=" + supplier_name
				+ ", compliance_standard=" + compliance_standard + ", certification_date=" + certification_date
				+ ", expiration_date=" + expiration_date + ", certifying_authority=" + certifying_authority
				+ ", compliance_statement=" + compliance_statement + "]";
	}
	
	
	
}
