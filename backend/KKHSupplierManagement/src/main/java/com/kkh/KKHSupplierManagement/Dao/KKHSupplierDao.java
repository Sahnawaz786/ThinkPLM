package com.kkh.KKHSupplierManagement.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kkh.KKHSupplierManagement.resource.KKHSupplier;

public interface KKHSupplierDao  extends JpaRepository<KKHSupplier,Long> {

	public List<KKHSupplier> findByCategory(String category);
	
}
