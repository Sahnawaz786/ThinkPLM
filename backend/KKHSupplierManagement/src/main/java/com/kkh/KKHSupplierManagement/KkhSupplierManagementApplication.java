package com.kkh.KKHSupplierManagement;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_MasterPartObjectDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;

@SpringBootApplication
public class KkhSupplierManagementApplication {

	public static void main(String[]
 args) {
		SpringApplication.run(KkhSupplierManagementApplication.class, args);
		System.out.println();
		
//	 ConfigurableApplicationContext context = SpringApplication.run(KkhSupplierManagementApplication.class, args);
//		SupplierDao supplierDao = context.getBean(SupplierDao.class);
//		
//	List<KKHSupplier> user =	supplierDao.findByCategory("Manufacturer");
//	//	user.forEach(e-> System.out.println(e));
		
//		Supplier_MasterPartObjectDao supplier_MasterPartObjectDao= context.getBean(Supplier_MasterPartObjectDao.class);
//		
//	
//		
//		List<Supplier_MasterPartObject> user=supplier_MasterPartObjectDao.findByPart_number("2");
}}
	