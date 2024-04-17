package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.InventoryDao;
import com.kkh.KKHSupplierManagement.resource.Inventory;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Inventory_Service;

@Service
public class Inventory_Serviceimpl implements Inventory_Service{

	@Autowired
	private	InventoryDao inventoryDao;
	
	@Override
	public Inventory addInventory(Inventory inventory) {
		
		inventoryDao.save(inventory);
		return inventory;
	}

	@Override
	public List<Inventory> getInventory() {
		
		return this.inventoryDao.findAll();
	}

	@Override
	public Inventory getInventory(Long item_number) {
		return inventoryDao.getReferenceById(item_number);
	}

	@Override
	public Inventory updateInventory(Inventory inventory) {
		inventoryDao.save(inventory);
		return inventory;
	}

	@Override
	public HttpStatus deleteInventory(Long parseLong) {
		
		if(inventoryDao.existsById(parseLong)) {
			Inventory inventory1 = inventoryDao.getReferenceById(parseLong);
			inventoryDao.delete(inventory1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
}
