package com.kkh.KKHSupplierManagement.webservices;



import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kkh.KKHSupplierManagement.resource.PartUsageLink;
import com.kkh.KKHSupplierManagement.resource.Purchase_Order;
import com.kkh.KKHSupplierManagement.service.PartUsageLink_Service;



public class PartUsageLink_Rest_Controller {

	
	
	@Autowired
	private PartUsageLink_Service partusagelink_service;

	// add PartUsageLink
		@PostMapping(path = "/PartUsageLink")
		public ResponseEntity<Void> addPartUsageLink(@RequestBody PartUsageLink partusagelink) {

			PartUsageLink partusagelink1 = this.partusagelink_service.addPartUsageLink(partusagelink);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
					.buildAndExpand(partusagelink1.getId()).toUri();
System.out.println("in partusagelink");
			return ResponseEntity.created(uri).build();
		}
	
	// get PartUsageLink
		@GetMapping("/PartUsageLink")
		public List<PartUsageLink> getPartUsageLink() {

			return this.partusagelink_service.getPartUsageLink();
		}


	
	
}
