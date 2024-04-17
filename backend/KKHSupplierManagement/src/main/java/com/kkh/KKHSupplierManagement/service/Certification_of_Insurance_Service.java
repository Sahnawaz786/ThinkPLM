package com.kkh.KKHSupplierManagement.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.Certification_of_Insurance;

public interface Certification_of_Insurance_Service {

	
	
	
	public Certification_of_Insurance addCertification_of_Insurance(Certification_of_Insurance certification_of_insurance);

	public List<Certification_of_Insurance> getCertification_of_Insurances();

	public Certification_of_Insurance  getCertification_of_Insurance(Long policy_number);

	public Certification_of_Insurance updateCertification_of_Insurance(Certification_of_Insurance certification_of_insurance);

	public HttpStatus deleteCertification_of_Insurance(Long parseLong);
}
