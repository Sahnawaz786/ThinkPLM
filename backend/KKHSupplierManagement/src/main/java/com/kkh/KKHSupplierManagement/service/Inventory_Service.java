package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Inventory;

public interface Inventory_Service {

	
	
	public Inventory addInventory(Inventory inventory);

	public List<Inventory> getInventory();

	public Inventory  getInventory(Long item_number);

	public Inventory updateInventory(Inventory inventory);

	public HttpStatus deleteInventory(Long parseLong);
	
}
