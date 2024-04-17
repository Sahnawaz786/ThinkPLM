package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Certification_of_Insurance;
import com.kkh.KKHSupplierManagement.resource.Compliance_Certification;

public interface Compliance_Certification_Service {

	
	

public Compliance_Certification addCompliance_Certification(Compliance_Certification compliance_certification);

public List<Compliance_Certification> getCompliance_Certifications();

public Compliance_Certification  getCompliance_Certification(Long certification_number);

public Compliance_Certification updateCompliance_Certification(Compliance_Certification compliance_certification);

public HttpStatus deleteCompliance_Certification(Long parseLong);
	
	
	
	
}
