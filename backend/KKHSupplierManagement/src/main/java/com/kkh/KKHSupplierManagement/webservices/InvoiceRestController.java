package com.kkh.KKHSupplierManagement.webservices;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;


@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class InvoiceRestController {

	@Autowired
	private Invoice_Service invoice_service;

	// add get Invoices
	@PostMapping(path = "/addInvoice")
	public ResponseEntity<Void> addInvoice(@RequestBody Invoice invoice) {

		Invoice invoice1 = this.invoice_service.addInvoice(invoice);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{invoice_number}")
				.buildAndExpand(invoice1.getInvoice_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get get Invoices
	@GetMapping("/getInvoice")
	public List<Invoice> getInvoices() {

		return this.invoice_service.getInvoices();
	}

//	  	single Invoice get
	@GetMapping("/getIdInvoice/{invoice_number}")
	public @ResponseBody Invoice getInvoice(@PathVariable("invoice_number") Long invoice_number) {

		return this.invoice_service.getInvoice(invoice_number);

	}

//update Invoice using PUT request
	@PutMapping("/updateInvoice")
	public Invoice updateInvoice(@RequestBody Invoice invoice) {

		return this.invoice_service.updateInvoice(invoice);
	}

	// delete the Invoice
	@DeleteMapping("/deleteInvoice/{invoice_number}")
	public ResponseEntity<HttpStatus> deleteInvoice(@PathVariable("invoice_number") String invoice_number) {

		HttpStatus status3 = this.invoice_service.deleteInvoice(Long.parseLong(invoice_number));
		return new ResponseEntity<>(status3);

	}

}
