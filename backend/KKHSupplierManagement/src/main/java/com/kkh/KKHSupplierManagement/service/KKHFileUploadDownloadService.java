package com.kkh.KKHSupplierManagement.service;

import org.springframework.web.multipart.MultipartFile;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;

public interface KKHFileUploadDownloadService {

	public KKHSupplierDocument storeFile(MultipartFile file) throws Exception;
	
	public KKHSupplierDocument storeFile(KKHSupplierDocument kkhSupplierDocument) throws Exception;
	
	public KKHSupplierDocument getFile(Long id) throws Exception;
}
