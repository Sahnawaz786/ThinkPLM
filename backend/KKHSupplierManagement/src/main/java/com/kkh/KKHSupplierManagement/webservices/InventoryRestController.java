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

import com.kkh.KKHSupplierManagement.resource.Inventory;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Inventory_Service;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class InventoryRestController {

	@Autowired
	private Inventory_Service inventory_service;

	// add get Inventory
	@PostMapping(path = "/addInventory")
	public ResponseEntity<Void> addInventory(@RequestBody Inventory inventory) {

		Inventory inventory1 = this.inventory_service.addInventory(inventory);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{item_number}")
				.buildAndExpand(inventory1.getItem_number()).toUri();

		return ResponseEntity.created(uri).build();
	}

	// get get Inventory
	@GetMapping("/getInventory")
	public List<Inventory> getInventory() {

		return this.inventory_service.getInventory();
	}

//	  	single Inventory get
	@GetMapping("/getIdInventory/{item_number}")
	public @ResponseBody Inventory getInventory(@PathVariable("item_number") Long item_number) {

		return this.inventory_service.getInventory(item_number);
	}

//update Inventory using PUT request
	@PutMapping("/updateInventory")
	public Inventory updateInventory(@RequestBody Inventory inventory) {

		return this.inventory_service.updateInventory(inventory);
	}

	// delete the Inventory
	@DeleteMapping("/deleteInventory/{item_number}")
	public ResponseEntity<HttpStatus> deleteInventory(@PathVariable("item_number") String item_number) {

		HttpStatus status3 = this.inventory_service.deleteInventory(Long.parseLong(item_number));
		return new ResponseEntity<>(status3);

	}

}
