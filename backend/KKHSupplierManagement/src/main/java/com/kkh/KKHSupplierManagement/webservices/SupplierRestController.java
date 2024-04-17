//package com.kkh.KKHSupplierManagement.webservices;
//
//import java.net.URI;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.kkh.KKHSupplierManagement.Dao.SupplierDao;
//import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
//import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
//import com.kkh.KKHSupplierManagement.service.KKHSupplierService;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class SupplierRestController {
//
//	@Autowired
//	private KKHSupplierService kkhSupplierService;
//	
//
//	// add Supplier Details
//	@PostMapping(path = "/addsuppliers")
//	public ResponseEntity<Void> addSupplierDetails(@RequestBody KKHSupplier kkhSupplierBean) {
//
//		KKHSupplier kkhSupplier = this.kkhSupplierService.addSupplierDetails(kkhSupplierBean);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
//				.buildAndExpand(kkhSupplier.getId()).toUri();
//
//		return ResponseEntity.created(uri).build();
//	}
//
////get Supplier Details
//	@GetMapping("/getsuppliers")
//	public List<KKHSupplier> getSuppliers() {
//
//		return this.kkhSupplierService.getSuppliers();
//	}
//
////	single Supplier get
//	@GetMapping("/getIdsuppliers/{id}")
//	public @ResponseBody KKHSupplier getSupplier(@PathVariable("id") Long id) {
//		System.out.println("in get Supplier");
//
//		return this.kkhSupplierService.getSupplier(id);
//
//	}
//
//// update course using PUT request
//	@PutMapping("/updatesuppliers")
//	public KKHSupplier updateSupplier(@RequestBody KKHSupplier kkhSupplierBean) {
//
//		return this.kkhSupplierService.updateSupplier(kkhSupplierBean);
//	}
//
////delete the course
//	@DeleteMapping("/deletesuppliers/{supplierId}")
//	public ResponseEntity<HttpStatus> deleteSupplier(@PathVariable("supplierId") String supplierId) {
//
//		HttpStatus status = this.kkhSupplierService.deleteSupplier(Long.parseLong(supplierId));
//		return new ResponseEntity<>(status);
//
//	}
//	
//	
//	
//
//	@GetMapping("/suppliers1/{category}")
//	public @ResponseBody List<KKHSupplier> getSupplierCategory(@PathVariable("category") String category){
//		System.out.println("in category");
//		
//	return this.kkhSupplierService.getSupplierCategory(category);
//	}
//
//
//
//}
