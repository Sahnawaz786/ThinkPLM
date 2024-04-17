package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkh.KKHSupplierManagement.resource.Invoice;


public interface InvoiceDao extends JpaRepository<Invoice,Long> {
	

}
