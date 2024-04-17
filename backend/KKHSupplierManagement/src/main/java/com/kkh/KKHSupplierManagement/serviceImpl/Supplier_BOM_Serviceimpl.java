package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Supplier_BOMDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_PartsDao;
import com.kkh.KKHSupplierManagement.resource.Supplier_BOM;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.service.Supplier_BOM_Service;

@Service
public class Supplier_BOM_Serviceimpl  implements Supplier_BOM_Service {

	@Autowired
	private Supplier_BOMDao supplier_bomDao;

	@Override
	public Supplier_BOM addSupplier_BOM(Supplier_BOM supplier_bom) {

		supplier_bomDao.save(supplier_bom);
		return supplier_bom;
	}

	@Override
	public List<Supplier_BOM> getSupplier_BOM() {

		return this.supplier_bomDao.findAll();
	}

	@Override
	public Supplier_BOM getSupplier_BOM(Long part_number) {

		return supplier_bomDao.getReferenceById(part_number);
	}

	@Override
	public Supplier_BOM updateSupplier_BOM(Supplier_BOM supplier_bom) {
		supplier_bomDao.save(supplier_bom);
		return supplier_bom;
	}

	@Override
	public HttpStatus deleteSupplier_BOM(Long parseLong) {
		if(supplier_bomDao.existsById(parseLong)) {
			Supplier_BOM supplier_bom = supplier_bomDao.getReferenceById(parseLong);
			supplier_bomDao.delete(supplier_bom);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	

	

}
