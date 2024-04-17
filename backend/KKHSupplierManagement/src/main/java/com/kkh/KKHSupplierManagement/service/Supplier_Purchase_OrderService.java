package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Supplier_Purchase_Order;

public interface Supplier_Purchase_OrderService {

	public Supplier_Purchase_Order addSupplier_Purchase_Order(Supplier_Purchase_Order supplier_purchase_order);

	public List<Supplier_Purchase_Order> getSupplier_Purchase_Order();

	public Supplier_Purchase_Order getSupplier_Purchase_Order(Long purchase_order_number);

	public Supplier_Purchase_Order updateSupplier_Purchase_Order(Supplier_Purchase_Order supplier_purchase_order);

	public HttpStatus deleteSupplier_Purchase_Order(Long parseLong);
}
