package com.kkh.KKHSupplierManagement.webservices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocumentResponse;
import com.kkh.KKHSupplierManagement.service.KKHFileUploadDownloadService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class KKHFileUploadDownloadController {

	@Autowired
	KKHFileUploadDownloadService kkhFileUploadDownloadService;
	

	/*@PostMapping("/uploadFile")
    public KKHSupplierDocumentResponse uploadFile(@RequestParam("file") MultipartFile file) {
		KKHSupplierDocument fileName;
		
		try {
			fileName = kkhFileUploadDownloadService.storeFile(file);
			
			
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
		            .path("/downloadFile/")
		            .path(fileName.getId().toString())
		            .toUriString();

		        return new KKHSupplierDocumentResponse(fileName.getFileName(),
		        		fileDownloadUri,file.getContentType(),file.getSize(),fileName.getPricing_and_Payment_Terms(),fileName.getTerm_and_Termination(),fileName.getGovering_Law_and_Jurisdication(),fileName.getSignatures(),fileName.getItemized_Charges(),fileName.getPayment_Instructions(),fileName.getInsurance_Coverage(),fileName.getAuthorized_Signature(),fileName.getCompliance_Standard(),fileName.getCertifying_Authority(),fileName.getCompliance_Statement());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
        return new KKHSupplierDocumentResponse(null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null);
    }*/

	@PostMapping("/uploadFile")
    public ResponseEntity<Void> uploadFile(@RequestBody KKHSupplierDocument kkhSupplierDocument) {
		KKHSupplierDocument resDoc = null;
		URI uri = null;
		System.out.println("kkhSupplierDocument:0" + kkhSupplierDocument);
		try {
			resDoc = kkhFileUploadDownloadService.storeFile(kkhSupplierDocument);
			
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
		            .path("/downloadFile/")
		            .path(resDoc.getId().toString())
		            .toUriString();
			System.out.println("fileDownloadUri:" + fileDownloadUri);
			
			uri = ServletUriComponentsBuilder.fromCurrentRequest().fromPath("/{id}")
					.buildAndExpand(resDoc.getId()).toUri();
			return ResponseEntity.created(uri).build();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.created(uri).build();
    }

	
	
    /*@PostMapping("/uploadMultipleFiles")
    public List < KKHSupplierDocumentResponse > uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
            .stream()
            .map(file -> uploadFile(file))
            .collect(Collectors.toList());
    }*/
	
    /*@GetMapping("/downloadFile/{id}")
    public ResponseEntity < Resource > downloadFile(@PathVariable Long id, HttpServletRequest request) {
        // Load file as Resource
        KKHSupplierDocument databaseFile;
		try {
			databaseFile = kkhFileUploadDownloadService.getFile(id);
			return ResponseEntity.ok()
		            .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
		            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getFileName() + "\"")
		            .body(new ByteArrayResource(databaseFile.getDocument()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

       
    }*/
    
	@GetMapping("/downloadFile/{id}")
    public KKHSupplierDocument downloadFile(@PathVariable("id") Long id, HttpServletRequest request) {
        // Load file as Resource
        KKHSupplierDocument databaseFile = null;
        
		try {
			databaseFile = kkhFileUploadDownloadService.getFile(id);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return databaseFile;
       
    }
	
}
