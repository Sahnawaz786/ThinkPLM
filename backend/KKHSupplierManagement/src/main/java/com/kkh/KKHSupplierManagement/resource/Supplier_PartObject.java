package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Supplier_PartObject {

	@Id
	@GeneratedValue
	private Long id;
	private String supplier_category;
	private String supplier_name;
	private String material;
	private String mpn_number;
	private String weight;
	private String dimension;
	private String cost;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date lead_date;
	private String quality_matrices;
	private String compliance_information;
	private Long masterId;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date modifiedDate;
	private  int iteration_info;
	private int islatest_Iteration;
	@ManyToOne
    @JoinColumn(name = "masterPartObject")
	private Supplier_MasterPartObject masterPartObject;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSupplier_catagory() {
		return supplier_category;
	}
	public void setSupplier_catagory(String supplier_catagory) {
		this.supplier_category = supplier_catagory;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMpn_number() {
		return mpn_number;
	}
	public void setMpn_number(String mpn_number) {
		this.mpn_number = mpn_number;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Date getLead_date() {
		return lead_date;
	}
	public void setLead_date(Date lead_date) {
		this.lead_date = lead_date;
	}
	public String getQuality_matrices() {
		return quality_matrices;
	}
	public void setQuality_matrices(String quality_matrices) {
		this.quality_matrices = quality_matrices;
	}
	public String getCompliance_information() {
		return compliance_information;
	}
	public void setCompliance_information(String compliance_information) {
		this.compliance_information = compliance_information;
	}
	public Long getMasterId() {
		return masterId;
	}
	public void setMasterId(Long masterId) {
		this.masterId = masterId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getIteration_info() {
		return iteration_info;
	}
	public void setIteration_info(int iteration_info) {
		this.iteration_info = iteration_info;
	}
	
	public int getIslatest_Iteration() {
		return islatest_Iteration;
	}
	public void setIslatest_Iteration(int islatest_Iteration) {
		this.islatest_Iteration = islatest_Iteration;
	}
	public Supplier_PartObject(Long id, String supplier_category, String supplier_name, String material,
			String mpn_number, String weight, String dimension, String cost, Date lead_date, String quality_matrices,
			String compliance_information, Long masterId, Date createdDate, Date modifiedDate, int iteration_info,
			int islatest_Iteration) {
		super();
		this.id = id;
		this.supplier_category = supplier_category;
		this.supplier_name = supplier_name;
		this.material = material;
		this.mpn_number = mpn_number;
		this.weight = weight;
		this.dimension = dimension;
		this.cost = cost;
		this.lead_date = lead_date;
		this.quality_matrices = quality_matrices;
		this.compliance_information = compliance_information;
		this.masterId = masterId;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.iteration_info = iteration_info;
		this.islatest_Iteration = islatest_Iteration;
	}
	public Supplier_PartObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Supplier_PartObject [id=" + id + ", supplier_category=" + supplier_category + ", supplier_name="
				+ supplier_name + ", material=" + material + ", mpn_number=" + mpn_number + ", weight=" + weight
				+ ", dimension=" + dimension + ", cost=" + cost + ", lead_date=" + lead_date + ", quality_matrices="
				+ quality_matrices + ", compliance_information=" + compliance_information + ", masterId=" + masterId
				+ ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", iteration_info="
				+ iteration_info + ", islatest_Iteration=" + islatest_Iteration + "]";
	}
	
	

	
	
	
	
	
}
