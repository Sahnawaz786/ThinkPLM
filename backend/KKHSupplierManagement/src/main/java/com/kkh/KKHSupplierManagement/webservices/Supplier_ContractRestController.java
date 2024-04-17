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

import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.service.KKHSupplierService;
import com.kkh.KKHSupplierManagement.service.Supplier_Contract_Service;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class Supplier_ContractRestController {

	@Autowired
	private Supplier_Contract_Service supplier_contract_service;

	// add Supplier_Contract
	@PostMapping(path = "/addSupplier_Contract")
	public ResponseEntity<Void> addSupplier_Contract(@RequestBody Supplier_Contract supplier_contract) {

		Supplier_Contract supplier_contract1 = this.supplier_contract_service.addSupplier_Contract(supplier_contract);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{document_number}")
				.buildAndExpand(supplier_contract1.getDocument_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get Supplier_Contract
	@GetMapping("/getSupplier_Contract")
	public List<Supplier_Contract> getSupplier_contracts() {

		return this.supplier_contract_service.getSupplier_contracts();
	}

//	  	single Supplier_Contract get
	@GetMapping("/getIdSupplier_Contract/{document_number}")
	public @ResponseBody Supplier_Contract getSupplier_Contract(@PathVariable("document_number") Long document_number) {
		System.out.println("in get Supplier_Contract");

		return this.supplier_contract_service.getSupplier_Contract(document_number);

	}

//update course using PUT request
	@PutMapping("/updateSupplier_Contract")
	public Supplier_Contract updateSupplier_Contract(@RequestBody Supplier_Contract supplier_contract) {

		return this.supplier_contract_service.updateSupplier_Contract(supplier_contract);
	}

	// delete the course
	@DeleteMapping("/deleteSupplier_Contract/{document_number}")
	public ResponseEntity<HttpStatus> deleteSupplier_Contract(@PathVariable("document_number") String document_number) {

		HttpStatus status1 = this.supplier_contract_service.deleteSupplier_Contract(Long.parseLong(document_number));
		return new ResponseEntity<>(status1);

	}

}
