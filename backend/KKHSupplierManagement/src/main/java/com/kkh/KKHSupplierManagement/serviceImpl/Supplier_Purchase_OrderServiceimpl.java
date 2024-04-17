package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Supplier_PartsDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_Purchase_OrderDao;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.resource.Supplier_Purchase_Order;
import com.kkh.KKHSupplierManagement.service.Supplier_Purchase_OrderService;
@Service
public class Supplier_Purchase_OrderServiceimpl implements  Supplier_Purchase_OrderService {

	
	@Autowired
	private Supplier_Purchase_OrderDao supplier_purchase_orderDao;
	
	@Override
	public Supplier_Purchase_Order addSupplier_Purchase_Order(Supplier_Purchase_Order supplier_purchase_order) {
		supplier_purchase_orderDao.save(supplier_purchase_order);		
		return supplier_purchase_order;
	}

	@Override
	public List<Supplier_Purchase_Order> getSupplier_Purchase_Order() {

		return this.supplier_purchase_orderDao.findAll();
	}

	@Override
	public Supplier_Purchase_Order getSupplier_Purchase_Order(Long purchase_order_number) {

		return supplier_purchase_orderDao.getReferenceById(purchase_order_number);
	}

	@Override
	public Supplier_Purchase_Order updateSupplier_Purchase_Order(Supplier_Purchase_Order supplier_purchase_order) {

		supplier_purchase_orderDao.save(supplier_purchase_order);
		return supplier_purchase_order;
	}

	@Override
	public HttpStatus deleteSupplier_Purchase_Order(Long parseLong) {

		if(supplier_purchase_orderDao.existsById(parseLong)) {
			Supplier_Purchase_Order supplier_purchase_order = supplier_purchase_orderDao.getReferenceById(parseLong);
			supplier_purchase_orderDao.delete(supplier_purchase_order);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
