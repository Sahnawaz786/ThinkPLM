package com.kkh.KKHSupplierManagement.webservices;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierRequestBean;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier_MasterObject;
import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;
import com.kkh.KKHSupplierManagement.service.KKHSupplierService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class KKHSupplierRestController {

	@Autowired
	private KKHSupplierService kkhSupplierService;
	

	// add Supplier Details
	@PostMapping(path = "/addsuppliers")
	public ResponseEntity<Void> addSupplierDetails(@RequestBody KKHSupplier kkhSupplierBean) {

		KKHSupplier kkhSupplier = this.kkhSupplierService.addSupplierDetails(kkhSupplierBean);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(kkhSupplier.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

//get Supplier Details
	@GetMapping("/getsuppliers")
	public List<KKHSupplier> getSuppliers() {

		return this.kkhSupplierService.getSuppliers();
	}
//	single Supplier get
	@GetMapping("/getIdsuppliers/{id}")
	public @ResponseBody KKHSupplier getSupplier(@PathVariable("id") Long id) {
		System.out.println("in get Supplier");

		return this.kkhSupplierService.getSupplier(id);

	}

// update course using PUT request
	@PutMapping("/updatesuppliers")
	public KKHSupplier updateSupplier(@RequestBody KKHSupplier kkhSupplierBean) {

		return this.kkhSupplierService.updateSupplier(kkhSupplierBean);
	}

//delete the course
	@DeleteMapping("/deletesuppliers/{supplierId}")
	public ResponseEntity<HttpStatus> deleteSupplier(@PathVariable("supplierId") String supplierId) {

		HttpStatus status = this.kkhSupplierService.deleteSupplier(Long.parseLong(supplierId));
		return new ResponseEntity<>(status);

	}
	
	
	
	//search by the category
	@GetMapping("/suppliers1/{category}")
	public @ResponseBody List<KKHSupplier> getSupplierCategory(@PathVariable("category") String category){
		System.out.println("in category");
		
	return this.kkhSupplierService.getSupplierCategory(category);
	}


	
	
	
	//History maintain
	
	@PostMapping(path = "/CreateSupplier")
	public ResponseEntity<Void> createSupplier(@RequestBody KKHSupplierRequestBean kkhsupplierRequestBean) {

		
		KKHSupplierRequestBean kkhsupplierRequestBean1 = this.kkhSupplierService.createSupplier(kkhsupplierRequestBean);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(kkhsupplierRequestBean1.getId()).toUri();
System.out.println("In create supplier");
		return ResponseEntity.created(uri).build();
	}
	
	
	@GetMapping(path = "/getSupplierMaster")
	public ArrayList<KKHSupplierRequestBean> getSupplierMaster() {

		
		ArrayList<KKHSupplierRequestBean> kkhsupplierRequestBeanList = this.kkhSupplierService.getSupplierMaster();
		
		return kkhsupplierRequestBeanList;
	}
	
	
	@GetMapping(path = "/KKHSupplierMasterObject/{masterId}")
	public KKHSupplier_MasterObject getKKHSupplierMasterObjectsById(@PathVariable("masterId") Long masterId) {
		
		KKHSupplier_MasterObject supMasterObject = this.kkhSupplierService.getKKHSupplierMasterObjectsById(masterId);
		return supMasterObject;
	}
	
	
	@GetMapping(path = "/KKHSupplierMasterObject")
	public List<KKHSupplier_MasterObject> getKKHSupplier_MasterObject() {
		
		List<KKHSupplier_MasterObject> supMasterObjectList = this.kkhSupplierService.getKKHSupplier_MasterObject();
		return supMasterObjectList;
	}
	
	
	@PostMapping(path = "/KKHSupplierMasterObject")
	public ResponseEntity<Void> createSupplier_Object(@RequestBody KKHSupplier_MasterObject kkhsupplier_MasterObject) {

		
		KKHSupplier_MasterObject kkhsupplier_MasterObject1 = this.kkhSupplierService.createSupplier_Object(kkhsupplier_MasterObject);
		
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(kkhsupplier_MasterObject1.getId()).toUri();

	 	return ResponseEntity.created(uri).build();
	}
	
	
	@PutMapping(path = "/KKHSupplierMasterObject")
	public ResponseEntity<Void> updateKKHSupplier_Object(@RequestBody KKHSupplier_MasterObject kkhsupplier_MasterObject) {

		
		KKHSupplier_MasterObject kkhsupplier_MasterObject1 = this.kkhSupplierService.updateKKHSupplier_Object(kkhsupplier_MasterObject);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
				.buildAndExpand(kkhsupplier_MasterObject1.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping(path = "/KKHSupplierMasterObjectHistory/{masterId}")
	public KKHSupplier_MasterObject getKKHSupplier_MasterObjectHistoryById(@PathVariable("masterId") Long masterId) {
		
		KKHSupplier_MasterObject kkhsupMasterObject = this.kkhSupplierService.getKKHSupplier_MasterObjectHistoryById(masterId);
		return kkhsupMasterObject;
	}
	
	
	@DeleteMapping("/KKHSupplierMasterObject/{masterId}")
	public ResponseEntity<HttpStatus> deleteKKHSupplier_MasterObject(@PathVariable("masterId") String masterId) {

		HttpStatus status = this.kkhSupplierService.deleteKKHSupplier_MasterObject(Long.parseLong(masterId));
		return new ResponseEntity<>(status);

	}

	
	@DeleteMapping("/KKHSupplierObject/{id}")
	public ResponseEntity<HttpStatus> deleteKKHSupplier_ObjectHistoryById(@PathVariable("id") String id) {

		HttpStatus status = this.kkhSupplierService.deleteKKHSupplier_ObjectHistoryById(Long.parseLong(id));
		return new ResponseEntity<>(status);

	}

	@GetMapping(path = "/KKHSupplier_MasterObjectByName/{name}")
	public @ResponseBody List<KKHSupplier_MasterObject> getKKHSupplier_MasterObjectByname(@PathVariable("name") String name) {
		
		return this.kkhSupplierService.getKKHSupplier_MasterObjectByname(name);

	}
	
}
