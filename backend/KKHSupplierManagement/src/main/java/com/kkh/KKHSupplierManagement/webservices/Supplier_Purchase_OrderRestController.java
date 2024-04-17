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

import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.resource.Supplier_Purchase_Order;
import com.kkh.KKHSupplierManagement.service.Supplier_Parts_Service;
import com.kkh.KKHSupplierManagement.service.Supplier_Purchase_OrderService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Supplier_Purchase_OrderRestController {

	
	
	@Autowired
	private Supplier_Purchase_OrderService supplier_purchase_orderService;
	
	
	

	@PostMapping(path = "/addSupplier_Purchase_Order")
	public ResponseEntity<Void> addSupplier_Purchase_Order(@RequestBody Supplier_Purchase_Order supplier_purchase_order) {

		Supplier_Purchase_Order supplier_purchase_order1 = this.supplier_purchase_orderService.addSupplier_Purchase_Order(supplier_purchase_order);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{purchase_order_number}")
				.buildAndExpand(supplier_purchase_order1.getPurchase_order_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@GetMapping("/getSupplier_Purchase_Order")
	public List<Supplier_Purchase_Order> getSupplier_Purchase_Order() {

		return this.supplier_purchase_orderService.getSupplier_Purchase_Order();
	}

	@GetMapping("/getIdSupplier_Purchase_Order/{purchase_order_number}")
	public @ResponseBody Supplier_Purchase_Order getSupplier_Purchase_Order(@PathVariable("purchase_order_number") Long purchase_order_number) {
		

		return this.supplier_purchase_orderService.getSupplier_Purchase_Order(purchase_order_number);

	}

	@PutMapping("/updateSupplier_Purchase_Order")
	public Supplier_Purchase_Order updateSupplier_Purchase_Order(@RequestBody Supplier_Purchase_Order supplier_purchase_order) {

		return this.supplier_purchase_orderService.updateSupplier_Purchase_Order(supplier_purchase_order);
	}

	@DeleteMapping("/deleteSupplier_Purchase_Order/{PO_Number}")
	public ResponseEntity<HttpStatus> deleteSupplier_Purchase_Order(@PathVariable("purchase_order_number") String purchase_order_number) {

		HttpStatus status = this.supplier_purchase_orderService.deleteSupplier_Purchase_Order(Long.parseLong(purchase_order_number));
		return new ResponseEntity<>(status);

	}
	
	
	
	
	
}
