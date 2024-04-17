package com.kkh.KKHSupplierManagement.resource;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class KKHSupplier_Object {

	@Id
	@GeneratedValue
	private Long id;
	private String email;
	private Long contact;
	private String pt;
	private String country;
	private String state;
	private String district;
	private String location;
	private String document;
	private Long masterId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date start_date;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date end_date;
	private int iteration_info;
	private int isletest_Iteration;
	@ManyToOne
	@JoinColumn(name = "supplierObject")
	private KKHSupplier_MasterObject supplierObject;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public Long getMasterId() {
		return masterId;
	}
	public void setMasterId(Long masterId) {
		this.masterId = masterId;
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
	public int getIteration_info() {
		return iteration_info;
	}
	public void setIteration_info(int iteration_info) {
		this.iteration_info = iteration_info;
	}
	public int getIsletest_Iteration() {
		return isletest_Iteration;
	}
	public void setIsletest_Iteration(int isletest_Iteration) {
		this.isletest_Iteration = isletest_Iteration;
	}
	
	public KKHSupplier_Object(Long id, String email, Long contact, String pt, String country, String state,
			String district, String location, String document, Long masterId, Date start_date, Date end_date,
			int iteration_info, int isletest_Iteration) {
		super();
		this.id = id;
		this.email = email;
		this.contact = contact;
		this.pt = pt;
		this.country = country;
		this.state = state;
		this.district = district;
		this.location = location;
		this.document = document;
		this.masterId = masterId;
		this.start_date = start_date;
		this.end_date = end_date;
		this.iteration_info = iteration_info;
		this.isletest_Iteration = isletest_Iteration;
		
	}
	public KKHSupplier_Object() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "KKHSupplier_Object [id=" + id + ", email=" + email + ", contact=" + contact + ", pt="
				+ pt + ", country=" + country + ", state=" + state + ", district=" + district + ", location=" + location
				+ ", document=" + document + ", masterId=" + masterId + ", start_date=" + start_date + ", end_date="
				+ end_date + ", iteration_info=" + iteration_info + ", isletest_Iteration=" + isletest_Iteration
				;
	}



}
