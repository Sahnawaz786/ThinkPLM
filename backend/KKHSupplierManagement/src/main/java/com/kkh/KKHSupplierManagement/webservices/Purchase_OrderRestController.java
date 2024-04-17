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

import com.kkh.KKHSupplierManagement.resource.Purchase_Order;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.service.Purchase_Order_Service;
import com.kkh.KKHSupplierManagement.service.Supplier_Contract_Service;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class Purchase_OrderRestController {

	@Autowired
	private Purchase_Order_Service purchase_order_service;

	// add Supplier_Contract
	@PostMapping(path = "/Purchase_Order")
	public ResponseEntity<Void> addPurchase_Order(@RequestBody Purchase_Order purchase_order) {

		Purchase_Order purchase_order1 = this.purchase_order_service.addPurchase_Order(purchase_order);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{Purchase_order_number}")
				.buildAndExpand(purchase_order1.getPurchase_order_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get Supplier_Contract
	@GetMapping("/Purchase_Order")
	public List<Purchase_Order> getPurchase_Orders() {

		return this.purchase_order_service.getPurchase_Orders();
	}

//	  	single Supplier_Contract get
	@GetMapping("/Purchase_Order/{Purchase_Order_Number}")
	public @ResponseBody Purchase_Order getPurchase_Order(
			@PathVariable("Purchase_Order_Number") Long Purchase_Order_Number) {
		System.out.println("in get Supplier_Contract");

		return this.purchase_order_service.getPurchase_Order(Purchase_Order_Number);

	}

//update course using PUT request
	@PutMapping("/Purchase_Order")
	public Purchase_Order updatePurchase_Order(@RequestBody Purchase_Order purchase_order) {

		return this.purchase_order_service.updatePurchase_Order(purchase_order);
	}

	// delete the course
	@DeleteMapping("/Purchase_Order/{Purchase_Order_Number}")
	public ResponseEntity<HttpStatus> deletePurchase_Order(
			@PathVariable("Purchase_Order_Number") String Purchase_Order_Number) {

		HttpStatus status2 = this.purchase_order_service.deletePurchase_Order(Long.parseLong(Purchase_Order_Number));
		return new ResponseEntity<>(status2);

	}

}
