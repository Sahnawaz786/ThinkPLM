package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kkh.KKHSupplierManagement.resource.PartUsageLink;
@Repository
public interface PartUsageLinkDao extends JpaRepository<PartUsageLink, Long> {

}
