package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Inventory {
	
    @Id
    @GeneratedValue
	private Long item_number;
	private String item_name;
	private String item_description;
	private String supplier_category;
	private String supplier_name;
	private String quantity;
	private String unit_of_measure;
	private String cost_per_unit;
	private String location;
	private String    reorder_point;
	private String lead_time;
	private Date expiration_date;
	private String lifecycle_status;
	public Long getItem_number() {
		return item_number;
	}
	public void setItem_number(Long item_number) {
		this.item_number = item_number;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_description() {
		return item_description;
	}
	public void setItem_description(String item_description) {
		this.item_description = item_description;
	}
	public String getSupplier_category() {
		return supplier_category;
	}
	public void setSupplier_category(String supplier_category) {
		this.supplier_category = supplier_category;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnit_of_measure() {
		return unit_of_measure;
	}
	public void setUnit_of_measure(String unit_of_measure) {
		this.unit_of_measure = unit_of_measure;
	}
	public String getCost_per_unit() {
		return cost_per_unit;
	}
	public void setCost_per_unit(String cost_per_unit) {
		this.cost_per_unit = cost_per_unit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRecorder_point() {
		return reorder_point;
	}
	public void setRecorder_point(String recorder_point) {
		this.reorder_point = recorder_point;
	}
	public String getLead_time() {
		return lead_time;
	}
	public void setLead_time(String lead_time) {
		this.lead_time = lead_time;
	}
	public Date getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getLifecycle_status() {
		return lifecycle_status;
	}
	public void setLifecycle_status(String lifecycle_status) {
		this.lifecycle_status = lifecycle_status;
	}
	public Inventory(Long item_number, String item_name, String item_description, String supplier_category,
			String supplier_name, String quantity, String unit_of_measure, String cost_per_unit, String location,
			String reorder_point, String lead_time, Date expiration_date, String lifecycle_status) {
		this.item_number = item_number;
		this.item_name = item_name;
		this.item_description = item_description;
		this.supplier_category = supplier_category;
		this.supplier_name = supplier_name;
		this.quantity = quantity;
		this.unit_of_measure = unit_of_measure;
		this.cost_per_unit = cost_per_unit;
		this.location = location;
		this.reorder_point = reorder_point;
		this.lead_time = lead_time;
		this.expiration_date = expiration_date;
		this.lifecycle_status = lifecycle_status;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inventory [item_number=" + item_number + ", item_name=" + item_name + ", item_description="
				+ item_description + ", supplier_category=" + supplier_category + ", supplier_name=" + supplier_name
				+ ", quantity=" + quantity + ", unit_of_measure=" + unit_of_measure + ", cost_per_unit=" + cost_per_unit
				+ ", location=" + location + ", reorder_point=" + reorder_point + ", lead_time=" + lead_time
				+ ", expiration_date=" + expiration_date + ", lifecycle_status=" + lifecycle_status + "]";
	}
	
	
	
	
	
}
