package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Supplier_MasterPartDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_MasterPartObjectDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_PartObjectDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_PartsDao;
import com.kkh.KKHSupplierManagement.resource.PartUsageLink;
import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPart;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_PartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.service.Supplier_Parts_Service;
@Service
public class Supplier_Parts_Serviceimpl implements Supplier_Parts_Service {

	
	
	@Autowired
	private Supplier_PartsDao supplier_partsDao;
	@Autowired
	private Supplier_MasterPartDao supplier_MasterPartDao;
	@Autowired
	private Supplier_MasterPartObjectDao supplier_MasterPartObjectDao; 
	@Autowired
	private Supplier_PartObjectDao supplier_PartObjectDao;
 	
	@Override
	public Supplier_Parts addSupplier_Parts(Supplier_Parts supplier_parts) {

		supplier_partsDao.save(supplier_parts);
		return supplier_parts;
	}

	@Override
	public List<Supplier_Parts> getSupplier_Parts() {

		return this.supplier_partsDao.findAll();
	}

	@Override
	public Supplier_Parts getSupplier_Parts(Long part_number) {
		
		return supplier_partsDao.getReferenceById(part_number);
	}

	@Override
	public Supplier_Parts updateSupplier_Parts(Supplier_Parts supplier_parts) {
		supplier_partsDao.save(supplier_parts);
		return supplier_parts;
	}

	@Override
	public HttpStatus deleteSupplier_Parts(Long parseLong) {

		if(supplier_partsDao.existsById(parseLong)) {
			Supplier_Parts supplier_parts = supplier_partsDao.getReferenceById(parseLong);
			supplier_partsDao.delete(supplier_parts);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	@Override
	public SupplierPartRequestBean createSupplier_Part(SupplierPartRequestBean partRequestBean) {
		// TODO Auto-generated method stub
		Supplier_MasterPart masterPart = partRequestBean.getSupplier_MasterPart();
		System.out.println("masterPart:" + masterPart);
		Supplier_Parts parts = partRequestBean.getSupplier_Parts();
		System.out.println("parts:" + parts);
		Supplier_MasterPart savedMasterPart = supplier_MasterPartDao.save(masterPart);
		
		parts.setMasterId(savedMasterPart.getId());
		Supplier_Parts savedPart = supplier_partsDao.save(parts);
		
		SupplierPartRequestBean savedPartBean = new SupplierPartRequestBean(savedMasterPart.getId(), 
				savedMasterPart, savedPart);
		
		return savedPartBean;
	}

	@Override
	public ArrayList<SupplierPartRequestBean> getSupplierMasterParts() {
		// TODO Auto-generated method stub
		
		List<Supplier_MasterPart> masterPartList = supplier_MasterPartDao.findAll();
		List<Supplier_Parts> partList = supplier_partsDao.findAll();
		
		System.out.println("masterPartList:" + masterPartList);
		System.out.println("partList:" + partList);
		ArrayList<SupplierPartRequestBean> returnBeanList = new ArrayList<>();
		for(Supplier_MasterPart master : masterPartList) {
			SupplierPartRequestBean bean = new SupplierPartRequestBean();
			Supplier_Parts beanPart = new Supplier_Parts();
			bean.setId(master.getId());
			bean.setSupplier_MasterPart(master);
			for(Supplier_Parts part : partList) {
				if(part.getMasterId() == master.getId()) {
					beanPart = part;
				}
			}
			bean.setSupplier_Parts(beanPart);
			returnBeanList.add(bean);
		}
		
		return returnBeanList;
	}
	
	
	@Override
	public Supplier_MasterPartObject getSupplierMasterPartObjectsById(Long masterId) {
		// TODO Auto-generated method stub
		Set<Supplier_PartObject> returnPartSet = new HashSet<Supplier_PartObject> (); 
		Supplier_MasterPartObject obj  = supplier_MasterPartObjectDao.getReferenceById(masterId);
		Set<Supplier_PartObject> set1 = obj.getParts();
		for(Supplier_PartObject s: set1) {
			String isLatest = String.valueOf(s.getIslatest_Iteration());
			System.out.println("partList:" + isLatest);
			if(s.getIslatest_Iteration() == 1) {
				System.out.println("This is partList:" + isLatest);
				returnPartSet.add(s);
			}
		}
		obj.setParts(returnPartSet);
		
		
		//System.out.println("masterPartList:" + masterPartList);
		//System.out.println("partList:" + partList);
		
		
		return obj;
	}
	@Override
	public List<Supplier_MasterPartObject> getSupplierMasterPartObjects() {
		// TODO Auto-generated method stub
		
		List<Supplier_MasterPartObject> obj  = supplier_MasterPartObjectDao.findAll();
		
		for(Supplier_MasterPartObject master:obj) {
			Set<Supplier_PartObject> returnPartSet = new HashSet<Supplier_PartObject> (); 
			Set<Supplier_PartObject> set1 = master.getParts();
			for(Supplier_PartObject s: set1) {
				if(s.getIslatest_Iteration() == 1) {
					returnPartSet.add(s);
				}
			}
			master.setParts(returnPartSet);
		}
		
		return obj;
	}
	
//	@Override
//	public List<Supplier_MasterPartObject> getSupplierMasterPartObjects() {
//		// TODO Auto-generated method stub
//		
//		List<Supplier_MasterPartObject> obj  = supplier_MasterPartObjectDao.findAll();
//		//Set<Supplier_PartObject> set1 = obj.getParts();
//		//obj.setParts(set1);
//		
//		
//		//System.out.println("masterPartList:" + masterPartList);
//		//System.out.println("partList:" + partList);
//		
//		
//		return obj;
//	}
//	
	
	
	
	
	@Override
	public Supplier_MasterPartObject createSupplier_PartObject(Supplier_MasterPartObject masterPartObject) {
		// TODO Auto-generated method stub
		
		Supplier_MasterPartObject savedObj = supplier_MasterPartObjectDao.save(masterPartObject);
		Set<Supplier_PartObject> supplier_PartObjectSet= masterPartObject.getParts();
		for(Supplier_PartObject sObject : supplier_PartObjectSet) {
			sObject.setMasterId(savedObj.getId());
		}
		supplier_PartObjectDao.saveAll(supplier_PartObjectSet);
		return savedObj;
	}

	@Override
	public Supplier_MasterPartObject updateSupplier_PartObject(Supplier_MasterPartObject masterPartObject) {

		//Supplier_MasterPartObject savedObj = supplier_MasterPartObjectDao.save(masterPartObject);
		Set<Supplier_PartObject> supplier_PartObjectSet= masterPartObject.getParts();
		
		for(Supplier_PartObject sObject : supplier_PartObjectSet) {
			Supplier_PartObject partObj = supplier_PartObjectDao.getReferenceById(sObject.getId());
			partObj.setIslatest_Iteration(0);
			supplier_PartObjectDao.save(partObj);
		}
		
		for(Supplier_PartObject sObject : supplier_PartObjectSet) {
			sObject.setId(null);
			sObject.setMasterId(masterPartObject.getId());
			sObject.setIslatest_Iteration(1);
			sObject.setIteration_info(sObject.getIteration_info()+1);
		}
		supplier_PartObjectDao.saveAll(supplier_PartObjectSet);
		Supplier_MasterPartObject returnMasterObj = supplier_MasterPartObjectDao.getReferenceById(masterPartObject.getId());
		return returnMasterObj;
	}

	@Override
	public Supplier_MasterPartObject getSupplierMasterPartObjectsHistoryById(Long masterId) {
		// TODO Auto-generated method stub
		Set<Supplier_PartObject> returnPartSet = new HashSet<Supplier_PartObject> (); 
		Supplier_MasterPartObject obj  = supplier_MasterPartObjectDao.getReferenceById(masterId);
		
		return obj;
	}
	
	
	
	@Override
	public HttpStatus deleteSupplierMasterPartObject(Long parseLong) {
	
		if(supplier_MasterPartObjectDao.existsById(parseLong)) {
			Supplier_MasterPartObject obj = supplier_MasterPartObjectDao.getReferenceById(parseLong);
			Supplier_PartObject obj1 = supplier_PartObjectDao.getReferenceById(parseLong);
			supplier_MasterPartObjectDao.delete(obj);
			supplier_PartObjectDao.delete(obj1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	
	
	
	@Override
	public HttpStatus deleteSupplierPartObjectsHistoryById(Long parseLong) {

	
		if(supplier_PartObjectDao.existsById(parseLong)) {
			Supplier_PartObject obj1 = supplier_PartObjectDao.getReferenceById(parseLong);
			supplier_PartObjectDao.delete(obj1);
			
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
		
		
		
	}
	
	

	@Override
	public List<Supplier_MasterPartObject> getSupplier_MasterPartObjectBypart_number(String part_number) {

	
		
		return supplier_MasterPartObjectDao.findByPart_number(part_number);
	}

	
	

}

	
