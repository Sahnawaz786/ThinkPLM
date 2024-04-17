package com.kkh.KKHSupplierManagement.webservices;

import java.net.URI;
import java.util.ArrayList;
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

import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.service.Supplier_Parts_Service;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Supplier_PartsRestController {

	
	@Autowired
	private Supplier_Parts_Service supplier_parts_service;
	

	@PostMapping(path = "/addSupplier_Parts")
	public ResponseEntity<Void> addSupplier_Parts(@RequestBody Supplier_Parts supplier_parts) {

		Supplier_Parts Supplier_Parts = this.supplier_parts_service.addSupplier_Parts(supplier_parts);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(supplier_parts.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

//get Supplier Details
	@GetMapping("/getSupplier_Parts")
	public List<Supplier_Parts> getSupplier_Parts() {

		return this.supplier_parts_service.getSupplier_Parts();
	}

//	single Supplier get
	@GetMapping("/getIdSupplier_Parts/{Part_number}")
	public @ResponseBody Supplier_Parts getSupplier_Parts(@PathVariable("Part_number") Long Part_number) {
		

		return this.supplier_parts_service.getSupplier_Parts(Part_number);

	}

// update course using PUT request
	@PutMapping("/updateSupplier_Parts")
	public Supplier_Parts updateSupplier_Parts(@RequestBody Supplier_Parts supplier_parts) {

		return this.supplier_parts_service.updateSupplier_Parts(supplier_parts);
	}

//delete the course
	@DeleteMapping("/deleteSupplier_Parts/{Part_number}")
	public ResponseEntity<HttpStatus> deleteSupplier_Parts(@PathVariable("Part_number") String Part_number) {

		HttpStatus status = this.supplier_parts_service.deleteSupplier_Parts(Long.parseLong(Part_number));
		return new ResponseEntity<>(status);

	}
	
	//History maintain code
	
	@PostMapping(path = "/CreateSupplierPart")
	public ResponseEntity<Void> createSupplier_Part(@RequestBody SupplierPartRequestBean partRequestBean) {

		
		SupplierPartRequestBean supplierPartRequestBean = this.supplier_parts_service.createSupplier_Part(partRequestBean);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(supplierPartRequestBean.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(path = "/getSupplierMasterPart")
	public ArrayList<SupplierPartRequestBean> getSupplierMasterPart() {

		
		ArrayList<SupplierPartRequestBean> supplierPartRequestBeanList = this.supplier_parts_service.getSupplierMasterParts();
		
		return supplierPartRequestBeanList;
	}
	
	@GetMapping(path = "/SupplierMasterObject1/{masterId}")
	public Supplier_MasterPartObject getSupplierMasterObjectById(@PathVariable("masterId") Long masterId) {
		
		Supplier_MasterPartObject supMasterPartObject = this.supplier_parts_service.getSupplierMasterPartObjectsById(masterId);
		return supMasterPartObject;
	}
	
	@GetMapping(path = "/SupplierMasterObject")
	public List<Supplier_MasterPartObject> getSupplierMasterObjects() {
		
		List<Supplier_MasterPartObject> supMasterPartObjectList = this.supplier_parts_service.getSupplierMasterPartObjects();
		return supMasterPartObjectList;
	}
	

	@PostMapping(path = "/SupplierMasterObject")
	public ResponseEntity<Void> createSupplier_PartObject(@RequestBody Supplier_MasterPartObject masterPartObject) {

		
		Supplier_MasterPartObject supplier_MasterPartObject = this.supplier_parts_service.createSupplier_PartObject(masterPartObject);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(supplier_MasterPartObject.getId()).toUri();

	 	return ResponseEntity.created(uri).build();
	}
	

	@PutMapping(path = "/SupplierMasterObject")
	public ResponseEntity<Void> updateSupplier_PartObject(@RequestBody Supplier_MasterPartObject masterPartObject) {

		
		Supplier_MasterPartObject supplier_MasterPartObject = this.supplier_parts_service.updateSupplier_PartObject(masterPartObject);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(supplier_MasterPartObject.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(path = "/SupplierMasterObject/{masterId}")
	public Supplier_MasterPartObject getSupplierMasterObjectHistoryById(@PathVariable("masterId") Long masterId) {
		
		Supplier_MasterPartObject supMasterPartObject = this.supplier_parts_service.getSupplierMasterPartObjectsHistoryById(masterId);
		return supMasterPartObject;
	}
	
	
	@DeleteMapping("/SupplierMasterObject/{masterId}")
	public ResponseEntity<HttpStatus> deleteSupplierMasterPartObject(@PathVariable("masterId") String masterId) {

		HttpStatus status = this.supplier_parts_service.deleteSupplierMasterPartObject(Long.parseLong(masterId));
		return new ResponseEntity<>(status);

	}

	
	
	@DeleteMapping("/SupplierpartObject/{id}")
	public ResponseEntity<HttpStatus> deleteSupplierPartObjectsHistoryById(@PathVariable("id") String id) {

		HttpStatus status = this.supplier_parts_service.deleteSupplierPartObjectsHistoryById(Long.parseLong(id));
		return new ResponseEntity<>(status);

	}
	
	@GetMapping(path = "/Supplier_MasterPartObjectBypart_number/{part_number}")
	public @ResponseBody List<Supplier_MasterPartObject> getSupplier_MasterPartObjectBypart_number(@PathVariable("part_number") String part_number) {
		
		return this.supplier_parts_service.getSupplier_MasterPartObjectBypart_number(part_number);

	}
	
	
}
