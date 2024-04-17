package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class KKHSupplierDocument {

	@Id
	@GeneratedValue()

	private Long id;

//	private String fileName;

	private String fileType;

	@Column(columnDefinition = "LONGBLOB")
	// @Lob
	private String document;
//
//	// supplier_Contract
//	private String Pricing_and_Payment_Terms;
//	private String Term_and_Termination;
//	private String Govering_Law_and_Jurisdication;
//	private String Signatures;
//
//	// Invoices
//	private String Itemized_Charges;
//	private String Payment_Instructions;
//
//	// Certification_of_insurance
//
//	private String Insurance_Coverage;
//	private String Authorized_Signature;
//
//	// Compliance_Certificate
//
//	private String Compliance_Standard;
//	private String Certifying_Authority;
//	private String Compliance_Statement;

	public KKHSupplierDocument() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public String getFileName() {
//		return fileName;
//	}
//
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}


	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

//	public String getPricing_and_Payment_Terms() {
//		return Pricing_and_Payment_Terms;
//	}
//
//	public void setPricing_and_Payment_Terms(String pricing_and_Payment_Terms) {
//		Pricing_and_Payment_Terms = pricing_and_Payment_Terms;
//	}
//
//	public String getTerm_and_Termination() {
//		return Term_and_Termination;
//	}
//
//	public void setTerm_and_Termination(String term_and_Termination) {
//		Term_and_Termination = term_and_Termination;
//	}
//
//	public String getGovering_Law_and_Jurisdication() {
//		return Govering_Law_and_Jurisdication;
//	}
//
//	public void setGovering_Law_and_Jurisdication(String govering_Law_and_Jurisdication) {
//		Govering_Law_and_Jurisdication = govering_Law_and_Jurisdication;
//	}
//
//	public String getSignatures() {
//		return Signatures;
//	}
//
//	public void setSignatures(String signatures) {
//		Signatures = signatures;
//	}
//
//	public String getItemized_Charges() {
//		return Itemized_Charges;
//	}
//
//	public void setItemized_Charges(String itemized_Charges) {
//		Itemized_Charges = itemized_Charges;
//	}
//
//	public String getPayment_Instructions() {
//		return Payment_Instructions;
//	}
//
//	public void setPayment_Instructions(String payment_Instructions) {
//		Payment_Instructions = payment_Instructions;
//	}
//
//	public String getInsurance_Coverage() {
//		return Insurance_Coverage;
//	}
//
//	public void setInsurance_Coverage(String insurance_Coverage) {
//		Insurance_Coverage = insurance_Coverage;
//	}
//
//	public String getAuthorized_Signature() {
//		return Authorized_Signature;
//	}
//
//	public void setAuthorized_Signature(String authorized_Signature) {
//		Authorized_Signature = authorized_Signature;
//	}
//
//	public String getCompliance_Standard() {
//		return Compliance_Standard;
//	}
//
//	public void setCompliance_Standard(String compliance_Standard) {
//		Compliance_Standard = compliance_Standard;
//	}
//
//	public String getCertifying_Authority() {
//		return Certifying_Authority;
//	}
//
//	public void setCertifying_Authority(String certifying_Authority) {
//		Certifying_Authority = certifying_Authority;
//	}
//
//	public String getCompliance_Statement() {
//		return Compliance_Statement;
//	}
//
//	public void setCompliance_Statement(String compliance_Statement) {
//		Compliance_Statement = compliance_Statement;
//	}

	public KKHSupplierDocument(Long id, String fileType, String document) {
		super();
        this.id=id;
		
		this.fileType = fileType;
		this.document = document;
//		this.Pricing_and_Payment_Terms = pricing_and_Payment_Terms;
//		this.Term_and_Termination = term_and_Termination;
//		this.Govering_Law_and_Jurisdication = govering_Law_and_Jurisdication;
//		this.Signatures = signatures;
//		this.Itemized_Charges = itemized_Charges;
//		this.Payment_Instructions = payment_Instructions;
//		this.Insurance_Coverage = insurance_Coverage;
//		this.Authorized_Signature = authorized_Signature;
//		this.Compliance_Standard = compliance_Standard;
//		this.Certifying_Authority = certifying_Authority;
//		this.Compliance_Statement = compliance_Statement;
	}

}
