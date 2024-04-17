package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkh.KKHSupplierManagement.resource.Purchase_Order;

public interface Purchase_OrderDao extends JpaRepository<Purchase_Order,Long> {

}
