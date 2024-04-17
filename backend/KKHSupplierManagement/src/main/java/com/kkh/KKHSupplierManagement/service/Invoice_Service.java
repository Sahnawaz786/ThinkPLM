package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Invoice;

public interface Invoice_Service {

	
	public Invoice addInvoice(Invoice invoice);

	public List<Invoice> getInvoices();

	public Invoice  getInvoice(Long invoice_number);

	public Invoice updateInvoice(Invoice invoice);

	public HttpStatus deleteInvoice(Long parseLong);
	
	
	
	
}
