package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkh.KKHSupplierManagement.resource.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, Long> {

}
