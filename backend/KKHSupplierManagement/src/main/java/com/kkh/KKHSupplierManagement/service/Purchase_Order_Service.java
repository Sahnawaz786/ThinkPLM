package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Purchase_Order;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;

public interface Purchase_Order_Service {

	
	public Purchase_Order addPurchase_Order(Purchase_Order purchase_order);

	public List<Purchase_Order> getPurchase_Orders();

	public Purchase_Order  getPurchase_Order(Long id);

	public Purchase_Order updatePurchase_Order(Purchase_Order purchase_order);

	public HttpStatus deletePurchase_Order(Long parseLong);
	
	
	
}
