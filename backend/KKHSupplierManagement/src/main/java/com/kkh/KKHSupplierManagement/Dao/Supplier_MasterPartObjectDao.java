package com.kkh.KKHSupplierManagement.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;


public interface Supplier_MasterPartObjectDao extends JpaRepository<Supplier_MasterPartObject,Long>  {

	 @Query("SELECT p FROM Supplier_MasterPartObject p WHERE p.part_number = ?1")
	 List<Supplier_MasterPartObject> findByPart_number(String part_number);
	
}
