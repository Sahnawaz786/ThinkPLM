package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.InvoiceDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDocumentDao;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;

@Service
public class Invoice_Serviceimpl implements Invoice_Service{

	@Autowired
	private	InvoiceDao invoiceDao;
	
	@Autowired
	private	KKHSupplierDocumentDao kkhsupplierDocumentDao;
//	private String itemized_charges;
//	private String payment_instructions;
	
	@Override
	public Invoice addInvoice(Invoice invoice) {

		String itemized_charges= invoice.getItemized_charges();
		String payment_instructions= invoice.getPayment_instructions();
		
		KKHSupplierDocument Invoice_document=new KKHSupplierDocument();
		Invoice_document.setFileType("Invoice_doc");
		Invoice_document.setDocument(itemized_charges);
		Invoice_document.setDocument(payment_instructions);
		
		KKHSupplierDocument savedoc= kkhsupplierDocumentDao.save(Invoice_document);
		
		invoice.setItemized_charges(savedoc.getId().toString());
		invoice.setPayment_instructions(savedoc.getId().toString());
		

		invoiceDao.save(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoices() {

		return this.invoiceDao.findAll();
	}

	@Override
	public Invoice getInvoice(Long invoice_number) {
		
		return invoiceDao.getReferenceById(invoice_number);
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		
	invoiceDao.save(invoice);
		
		return invoice;
	}


	@Override
	public HttpStatus deleteInvoice(Long parseLong) {
		if(invoiceDao.existsById(parseLong)) {
			Invoice invoice1 = invoiceDao.getReferenceById(parseLong);
			invoiceDao.delete(invoice1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
