package com.kkh.KKHSupplierManagement.resource;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Supplier_BOM {

	@Id
	@GeneratedValue
	private Long part_number;
	private String part_name;
	private String description;
	private String supplier_catagory;
	private String supplier_name;
	private String quantity;
	private String unit_of_measure;
	private String reference_designator;
	private String mpn_number;
	private String material;
	private String cost;
	private String lead_time;
	public Long getPart_Number() {
		return part_number;
	}
	public void setPart_Number(Long part_Number) {
		this.part_number = part_Number;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSupplier_catagory() {
		return supplier_catagory;
	}
	public void setSupplier_catagory(String supplier_catagory) {
		this.supplier_catagory = supplier_catagory;
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
	public String getReference_designator() {
		return reference_designator;
	}
	public void setReference_designator(String reference_designator) {
		this.reference_designator = reference_designator;
	}
	public String getMpn_number() {
		return mpn_number;
	}
	public void setMpn_number(String mpn_number) {
		this.mpn_number = mpn_number;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getLead_time() {
		return lead_time;
	}
	public void setLead_time(String lead_time) {
		this.lead_time = lead_time;
	}
	public Supplier_BOM(Long part_Number, String part_name, String description, String supplier_catagory,
			String supplier_name, String quantity, String unit_of_measure, String reference_designator,
			String mpn_number, String material, String cost, String lead_time) {
		super();
		this.part_number = part_Number;
		this.part_name = part_name;
		this.description = description;
		this.supplier_catagory = supplier_catagory;
		this.supplier_name = supplier_name;
		this.quantity = quantity;
		this.unit_of_measure = unit_of_measure;
		this.reference_designator = reference_designator;
		this.mpn_number = mpn_number;
		this.material = material;
		this.cost = cost;
		this.lead_time = lead_time;
	}
	public Supplier_BOM() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Supplier_BOM [part_Number=" + part_number + ", part_name=" + part_name + ", description=" + description
				+ ", supplier_catagory=" + supplier_catagory + ", supplier_name=" + supplier_name + ", quantity="
				+ quantity + ", unit_of_measure=" + unit_of_measure + ", reference_designator=" + reference_designator
				+ ", mpn_number=" + mpn_number + ", material=" + material + ", cost=" + cost + ", lead_time="
				+ lead_time + "]";
	}
	
	
}
