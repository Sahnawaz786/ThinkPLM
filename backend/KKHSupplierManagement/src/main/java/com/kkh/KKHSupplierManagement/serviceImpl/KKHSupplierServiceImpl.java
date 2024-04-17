package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.KKHSupplier1Dao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDocumentDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplier_MasterDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplier_MasterObjectDao;
import com.kkh.KKHSupplierManagement.Dao.KKHSupplier_ObjectDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_ContractDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier1;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierRequestBean;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier_Master;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier_MasterObject;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier_Object;
import com.kkh.KKHSupplierManagement.resource.SupplierPartRequestBean;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPart;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_PartObject;
import com.kkh.KKHSupplierManagement.resource.Supplier_Parts;
import com.kkh.KKHSupplierManagement.service.KKHSupplierService;



@Service
public class KKHSupplierServiceImpl implements KKHSupplierService{

	@Autowired
	private	KKHSupplierDao supplierDao;
	@Autowired
	private	KKHSupplier1Dao supplier1Dao;
	@Autowired
	private	KKHSupplier_ObjectDao kkhsupplier_ObjectDao;
	@Autowired
	private	KKHSupplier_MasterObjectDao kkhsupplier_MasterObjectDao;
	@Autowired
	private	KKHSupplier_MasterDao kkhsupplier_MasterDao;
	@Autowired
private	KKHSupplierDocumentDao kkhsupplierDocumentDao;
	//kkhsupplier
	@Override
	public KKHSupplier addSupplierDetails(KKHSupplier kkhSupplierBean) {

		String Document1=kkhSupplierBean.getDocument();
		
		KKHSupplierDocument pricing_document=new KKHSupplierDocument();
		pricing_document.setFileType("Pricing_doc");
		pricing_document.setDocument(Document1);
		KKHSupplierDocument savedoc =	kkhsupplierDocumentDao.save(pricing_document);
		
		kkhSupplierBean.setDocument(savedoc.getId().toString());
		supplierDao.save(kkhSupplierBean);
		return kkhSupplierBean;
	}
	@Override
	public List<KKHSupplier> getSuppliers() {
		// TODO Auto-generated method stub
		return this.supplierDao.findAll();
	}
	
	@Override
	public KKHSupplier getSupplier(Long supplierId) {

		System.out.println("in doa method");
		return supplierDao.getReferenceById(supplierId);
	}
	@Override
	public KKHSupplier updateSupplier(KKHSupplier kkhSupplierBean) {
		
		supplierDao.save(kkhSupplierBean);
	
		return kkhSupplierBean;
		
	}
	@Override
	public HttpStatus deleteSupplier(Long parseLong) {
		
		if(supplierDao.existsById(parseLong)) {
			KKHSupplier supplierBean = supplierDao.getReferenceById(parseLong);
			supplierDao.delete(supplierBean);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
		
		
	}
	@Override
	public List<KKHSupplier> getSupplierCategory(String category) {

		return supplierDao.findByCategory(category);
	}
	
	//
	@Override
	public KKHSupplierRequestBean createSupplier(KKHSupplierRequestBean kkhsupplierRequestBean) {

		KKHSupplier_Master kkhsupplier_Master = kkhsupplierRequestBean.getKkhsupplier_Master();
		System.out.println("kkhsupplier_Master:" + kkhsupplier_Master);
		KKHSupplier1 kkhsupplier1 = kkhsupplierRequestBean.getKkhsupplier1();
		System.out.println("kkhsupplier1:" + kkhsupplier1);
		KKHSupplier_Master savedkkhsupplier_Master = kkhsupplier_MasterDao.save(kkhsupplier_Master);
		
		kkhsupplier1.setMasterId(savedkkhsupplier_Master.getId());;
		KKHSupplier1 savedkkhsupplier1 = supplier1Dao.save(kkhsupplier1);
		
		KKHSupplierRequestBean savedBean = new KKHSupplierRequestBean(savedkkhsupplier_Master.getId(), 
				savedkkhsupplier_Master, kkhsupplier1);
		
		return null;
	}
	

	@Override
	public ArrayList<KKHSupplierRequestBean> getSupplierMaster() {

		List<KKHSupplier_Master> mastersupplierList = kkhsupplier_MasterDao.findAll();
		List<KKHSupplier1> KKHSupplier1List = supplier1Dao.findAll();
		
		System.out.println("mastersupplierList:" + mastersupplierList);
		System.out.println("KKHSupplier1List:" + KKHSupplier1List);
		ArrayList<KKHSupplierRequestBean> returnBeanList = new ArrayList<>();
		for(KKHSupplier_Master master : mastersupplierList) {
			KKHSupplierRequestBean bean = new KKHSupplierRequestBean();
			KKHSupplier1 beanSupplier1 = new KKHSupplier1();
			bean.setId(master.getId());
			bean.setKkhsupplier_Master(master);
			for(KKHSupplier1 supplier1 : KKHSupplier1List) {
				if(supplier1.getMasterId() == master.getId()) {
					beanSupplier1 = supplier1;
				}
			}
			bean.setKkhsupplier1(beanSupplier1);
			returnBeanList.add(bean);
		}
		
		return returnBeanList;
	}
	@Override
	public KKHSupplier_MasterObject getKKHSupplierMasterObjectsById(Long masterId) {

		
		Set<KKHSupplier_Object> returnsupplierSet = new HashSet<KKHSupplier_Object> (); 
		KKHSupplier_MasterObject obj  = kkhsupplier_MasterObjectDao.getReferenceById(masterId);
		Set<KKHSupplier_Object> set1 = obj.getSupplier();
		for(KKHSupplier_Object s: set1) {
			if(s.getIsletest_Iteration() == 1) {
				returnsupplierSet.add(s);
			}
		}
		obj.setSupplier(returnsupplierSet);
		
		
		
		return obj;
	}
	@Override
	public List<KKHSupplier_MasterObject> getKKHSupplier_MasterObject() {


		List<KKHSupplier_MasterObject> obj  = kkhsupplier_MasterObjectDao.findAll();
		
		
		return obj;
	}
	@Override
	public KKHSupplier_MasterObject createSupplier_Object(KKHSupplier_MasterObject kkhsupplier_MasterObject) {
			
		KKHSupplier_MasterObject savedObj = kkhsupplier_MasterObjectDao.save(kkhsupplier_MasterObject);
			Set<KKHSupplier_Object> kkhsupplier_ObjectSet= kkhsupplier_MasterObject.getSupplier();
			for(KKHSupplier_Object sObject : kkhsupplier_ObjectSet) {
				sObject.setMasterId(savedObj.getId());
			}
			kkhsupplier_ObjectDao.saveAll(kkhsupplier_ObjectSet);
			return savedObj;
		}
	@Override
	public KKHSupplier_MasterObject updateKKHSupplier_Object(KKHSupplier_MasterObject kkhsupplier_MasterObject) {

		
		Set<KKHSupplier_Object> kkhsupplier_ObjectSet= kkhsupplier_MasterObject.getSupplier();
		
		for(KKHSupplier_Object sObject : kkhsupplier_ObjectSet) {
			KKHSupplier_Object KKHSupplierObj = kkhsupplier_ObjectDao.getReferenceById(sObject.getId());
			KKHSupplierObj.setIsletest_Iteration(0);
			kkhsupplier_ObjectDao.save(KKHSupplierObj);
		}
		
		for(KKHSupplier_Object sObject : kkhsupplier_ObjectSet) {
			sObject.setId(null);
			sObject.setMasterId(kkhsupplier_MasterObject.getId());
			sObject.setIsletest_Iteration(1);
			sObject.setIteration_info(sObject.getIteration_info()+1);
		}
		kkhsupplier_ObjectDao.saveAll(kkhsupplier_ObjectSet);
		KKHSupplier_MasterObject returnMasterObj = kkhsupplier_MasterObjectDao.getReferenceById(kkhsupplier_MasterObject.getId());
		return returnMasterObj;
	}
	@Override
	public KKHSupplier_MasterObject getKKHSupplier_MasterObjectHistoryById(Long masterId) {

		
		Set<KKHSupplier_Object> returnsupplierSet = new HashSet<KKHSupplier_Object> (); 
		KKHSupplier_MasterObject obj  = kkhsupplier_MasterObjectDao.getReferenceById(masterId);
		
		return obj;
	}
	@Override
	public HttpStatus deleteKKHSupplier_MasterObject(Long parseLong) {
		
		if(kkhsupplier_MasterObjectDao.existsById(parseLong)) {
			KKHSupplier_MasterObject obj = kkhsupplier_MasterObjectDao.getReferenceById(parseLong);
			KKHSupplier_Object obj1 = kkhsupplier_ObjectDao.getReferenceById(parseLong);
			kkhsupplier_MasterObjectDao.delete(obj);
			kkhsupplier_ObjectDao.delete(obj1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}
	@Override
	public HttpStatus deleteKKHSupplier_ObjectHistoryById(Long parseLong) {

		if(kkhsupplier_ObjectDao.existsById(parseLong)) {
			KKHSupplier_Object obj1 = kkhsupplier_ObjectDao.getReferenceById(parseLong);
			kkhsupplier_ObjectDao.delete(obj1);
			
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
		
		
		
	}
	
	@Override
	public List<KKHSupplier_MasterObject> getKKHSupplier_MasterObjectByname(String name) {

		return kkhsupplier_MasterObjectDao.findByName(name);
	}
	
	
	
	



	
	

	
	
}
