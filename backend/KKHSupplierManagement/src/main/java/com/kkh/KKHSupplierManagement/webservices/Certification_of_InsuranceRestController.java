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

import com.kkh.KKHSupplierManagement.resource.Certification_of_Insurance;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Certification_of_Insurance_Service;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class Certification_of_InsuranceRestController {

	@Autowired
	private Certification_of_Insurance_Service certification_of_insurance_service;

	// add get Invoices
	@PostMapping(path = "/addCertification_of_Insurance")
	public ResponseEntity<Void> addCertification_of_Insurance(
			@RequestBody Certification_of_Insurance certification_of_insurance) {

		Certification_of_Insurance Certification_of_Insurance1 = this.certification_of_insurance_service
				.addCertification_of_Insurance(certification_of_insurance);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{policy_number}")
				.buildAndExpand(Certification_of_Insurance1.getPolicy_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get get Certification_of_Insurances
	@GetMapping("/getCertification_of_Insurance")
	public List<Certification_of_Insurance> getCertification_of_Insurances() {

		return this.certification_of_insurance_service.getCertification_of_Insurances();
	}

//	  	single Certification_of_Insurance get
	@GetMapping("/getIdCertification_of_Insurance/{policy_number}")
	public @ResponseBody Certification_of_Insurance getCertification_of_Insurance(
			@PathVariable("policy_number") Long policy_number) {

		return this.certification_of_insurance_service.getCertification_of_Insurance(policy_number);

	}

//update Certification_of_Insurance using PUT request
	@PutMapping("/updateCertification_of_Insurance")
	public Certification_of_Insurance updateCertification_of_Insurance(
			@RequestBody Certification_of_Insurance certification_of_insurance) {

		return this.certification_of_insurance_service.updateCertification_of_Insurance(certification_of_insurance);
	}

	// delete the Certification_of_Insurance
	@DeleteMapping("/deleteCertification_of_Insurance/{policy_number}")
	public ResponseEntity<HttpStatus> deleteCertification_of_Insurance(
			@PathVariable("policy_number") String policy_number) {

		HttpStatus status4 = this.certification_of_insurance_service
				.deleteCertification_of_Insurance(Long.parseLong(policy_number));
		return new ResponseEntity<>(status4);

	}

}
