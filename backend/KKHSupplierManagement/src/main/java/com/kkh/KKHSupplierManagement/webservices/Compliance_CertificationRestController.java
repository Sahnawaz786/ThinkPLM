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

import com.kkh.KKHSupplierManagement.resource.Compliance_Certification;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Compliance_Certification_Service;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class Compliance_CertificationRestController {

	@Autowired
	private Compliance_Certification_Service compliance_certification_service;

	// add get Invoices
	@PostMapping(path = "/addCompliance_Certification")
	public ResponseEntity<Void> addCompliance_Certification(
			@RequestBody Compliance_Certification compliance_certification) {

		Compliance_Certification compliance_certification1 = this.compliance_certification_service
				.addCompliance_Certification(compliance_certification);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{certification_number}")
				.buildAndExpand(compliance_certification1.getCertification_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get get Compliance_Certification
	@GetMapping("/getCompliance_Certification")
	public List<Compliance_Certification> getCompliance_Certifications() {

		return this.compliance_certification_service.getCompliance_Certifications();
	}

//	  	single Compliance_Certification get
	@GetMapping("/getIdCompliance_Certification/{certification_number}")
	public @ResponseBody Compliance_Certification getCompliance_Certification(
			@PathVariable("certification_number") Long certification_number) {

		return this.compliance_certification_service.getCompliance_Certification(certification_number);

	}

//update Compliance_Certification using PUT request
	@PutMapping("/updateCompliance_Certification")
	public Compliance_Certification updateCompliance_Certification(
			@RequestBody Compliance_Certification compliance_certification) {

		return this.compliance_certification_service.updateCompliance_Certification(compliance_certification);
	}

	// delete the Compliance_Certification
	@DeleteMapping("/deleteCompliance_Certification/{certification_number}")
	public ResponseEntity<HttpStatus> deleteInvoice(@PathVariable("certification_number") String certification_number) {

		HttpStatus status5 = this.compliance_certification_service
				.deleteCompliance_Certification(Long.parseLong(certification_number));
		return new ResponseEntity<>(status5);

	}

}
