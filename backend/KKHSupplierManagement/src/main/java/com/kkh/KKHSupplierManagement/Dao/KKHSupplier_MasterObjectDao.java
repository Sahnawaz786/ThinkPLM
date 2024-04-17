package com.kkh.KKHSupplierManagement.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kkh.KKHSupplierManagement.resource.KKHSupplier_MasterObject;


public interface KKHSupplier_MasterObjectDao extends JpaRepository<KKHSupplier_MasterObject,Long>{

	
	 @Query("SELECT p FROM KKHSupplier_MasterObject p WHERE p.name = ?1")
	 List<KKHSupplier_MasterObject> findByName(String part_number);
	 
	
}
