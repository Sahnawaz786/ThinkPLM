package com.kkh.KKHSupplierManagement.resource;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class KKHSupplier {

	private String category;
    private	String name;
	private String email;
	private Long contact;
	@Id
	@GeneratedValue
	private Long id;
	private String pt;
	private String country;
	private String state;
	private String district;
	private String location;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private  Date start_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private  Date end_date;
    private String document;
    
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public KKHSupplier(String category, String name, String email, Long contact, Long id, String pt, String country,
			String state, String district, String location, Date start_date, Date end_date, String document) {
		super();
		this.category = category;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.id = id;
		this.pt = pt;
		this.country = country;
		this.state = state;
		this.district = district;
		this.location = location;
		this.start_date = start_date;
		this.end_date = end_date;
		this.document = document;
	}
	public KKHSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "KKHSupplier [category=" + category + ", name=" + name + ", email=" + email + ", contact=" + contact
				+ ", id=" + id + ", pt=" + pt + ", country=" + country + ", state=" + state + ", district=" + district
				+ ", location=" + location + ", start_date=" + start_date + ", end_date=" + end_date + ", document="
				+ document + "]";
	}
	
    
    
}