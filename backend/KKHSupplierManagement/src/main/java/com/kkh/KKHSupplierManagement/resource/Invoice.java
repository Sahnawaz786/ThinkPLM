package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Invoice {

	private String document_name;
	@Id
	@GeneratedValue
	private Long invoice_number;
	private String supplier_name;
	private Date invoice_date;
	private Date due_date;
	private String itemized_charges;
	private String amount_due;
	private String payment_instructions;
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public Long getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(Long invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public Date getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Date invoice_date) {
		this.invoice_date = invoice_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getItemized_charges() {
		return itemized_charges;
	}
	public void setItemized_charges(String itemized_charges) {
		this.itemized_charges = itemized_charges;
	}
	public String getAmount_due() {
		return amount_due;
	}
	public void setAmount_due(String amount_due) {
		this.amount_due = amount_due;
	}
	public String getPayment_instructions() {
		return payment_instructions;
	}
	public void setPayment_instructions(String payment_instructions) {
		this.payment_instructions = payment_instructions;
	}
	

	public Invoice(String document_name, Long invoice_number, String supplier_name, Date invoice_date, Date due_date,
			String itemized_charges, String amount_due, String payment_instructions) {
		super();
		this.document_name = document_name;
		this.invoice_number = invoice_number;
		this.supplier_name = supplier_name;
		this.invoice_date = invoice_date;
		this.due_date = due_date;
		this.itemized_charges = itemized_charges;
		this.amount_due = amount_due;
		this.payment_instructions = payment_instructions;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Invoice [document_name=" + document_name + ", invoice_number=" + invoice_number + ", supplier_name=" + supplier_name + ", invoice_date=" + invoice_date
				+ ", due_date=" + due_date + ", itemized_charges=" + itemized_charges + ", amount_due=" + amount_due
				+ ", payment_instructions=" + payment_instructions + "]";
	}
	
	
	
	
}
