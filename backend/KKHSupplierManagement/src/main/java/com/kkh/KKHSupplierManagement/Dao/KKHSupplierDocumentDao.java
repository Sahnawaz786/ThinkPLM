package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;

@Repository
public interface KKHSupplierDocumentDao extends JpaRepository<KKHSupplierDocument, Long> {

}
