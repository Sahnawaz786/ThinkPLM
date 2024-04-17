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

import com.kkh.KKHSupplierManagement.resource.Supplier_BOM;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.service.Supplier_BOM_Service;
import com.kkh.KKHSupplierManagement.service.Supplier_Parts_Service;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Supplier_BOMRestController {

	
	@Autowired
	private Supplier_BOM_Service supplier_BOM_service;
	
	
	

	@PostMapping(path = "/addSupplier_BOM")
	public ResponseEntity<Void> addSupplier_BOM(@RequestBody Supplier_BOM supplier_bom) {

		Supplier_BOM supplier_bom1 = this.supplier_BOM_service.addSupplier_BOM(supplier_bom);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{part_number}")
				.buildAndExpand(supplier_bom.getPart_Number()).toUri();

		return ResponseEntity.created(uri).build();
	}


	@GetMapping("/getSupplier_BOM")
	public List<Supplier_BOM> getSupplier_BOM() {

		return this.supplier_BOM_service.getSupplier_BOM();
	}


	@GetMapping("/getIdSupplier_BOM/{part_number}")
	public @ResponseBody Supplier_BOM getSupplier_BOM(@PathVariable("part_number") Long Part_number) {
		

		return this.supplier_BOM_service.getSupplier_BOM(Part_number);

	}


	@PutMapping("/updateSupplier_BOM")
	public Supplier_BOM updateSupplier_BOM(@RequestBody Supplier_BOM supplier_bom) {

		return this.supplier_BOM_service.updateSupplier_BOM(supplier_bom);
	}


	@DeleteMapping("/deleteSupplier_BOM/{part_number}")
	public ResponseEntity<HttpStatus> deleteSupplier_BOM(@PathVariable("part_number") String part_number) {

		HttpStatus status = this.supplier_BOM_service.deleteSupplier_BOM(Long.parseLong(part_number));
		return new ResponseEntity<>(status);

	}

	
	
}
