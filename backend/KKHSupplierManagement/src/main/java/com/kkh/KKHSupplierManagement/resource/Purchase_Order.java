package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Purchase_Order {

//	private String Document_Name;
//	private String Document_Type;
//	@Id
//	@GeneratedValue
//	private Long purchase_order_number;
//	private String Supplier_Name;
//	private Date Order_Date;
//	private Date Delivery_Date;
//	private String Item_Description;
//	private  String Quantity;
//	private String Unit_Price;
//	private String Total_Amount;
//	private String Shipping_Instructions;
//	
	@Id
	@GeneratedValue
	private Long purchase_order_number;
	private String  purchase_order_name;
	private String  purchase_order_description;
	private String  supplier_category;
	private String  supplier_name;
	private String  part_type;
	private String   quantity;
	private String   unit_price;
	private String   total_price;
	private String   delivery_date;
	private String    payment_terms;
	private String    shipping_method;
	private String   terms_and_conditions;
	private String  approval_status;
	private String   purchase_order_status;
	public Long getPurchase_order_number() {
		return purchase_order_number;
	}
	public void setPurchase_order_number(Long purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}
	public String getPurchase_order_name() {
		return purchase_order_name;
	}
	public void setPurchase_order_name(String purchase_order_name) {
		this.purchase_order_name = purchase_order_name;
	}
	public String getPurchase_order_description() {
		return purchase_order_description;
	}
	public void setPurchase_order_description(String purchase_order_description) {
		this.purchase_order_description = purchase_order_description;
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
	public String getPart_type() {
		return part_type;
	}
	public void setPart_type(String part_type) {
		this.part_type = part_type;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(String unit_price) {
		this.unit_price = unit_price;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getPayment_terms() {
		return payment_terms;
	}
	public void setPayment_terms(String payment_terms) {
		this.payment_terms = payment_terms;
	}
	public String getShipping_method() {
		return shipping_method;
	}
	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}
	public String getTerms_and_conditions() {
		return terms_and_conditions;
	}
	public void setTerms_and_conditions(String terms_and_conditions) {
		this.terms_and_conditions = terms_and_conditions;
	}
	public String getApproval_status() {
		return approval_status;
	}
	public void setApproval_status(String approval_status) {
		this.approval_status = approval_status;
	}
	public String getPurchase_order_status() {
		return purchase_order_status;
	}
	public void setPurchase_order_status(String purchase_order_status) {
		this.purchase_order_status = purchase_order_status;
	}
	public Purchase_Order(Long purchase_order_number, String purchase_order_name, String purchase_order_description,
			String supplier_category, String supplier_name, String part_type, String quantity, String unit_price,
			String total_price, String delivery_date, String payment_terms, String shipping_method,
			String terms_and_conditions, String approval_status, String purchase_order_status) {
		super();
		this.purchase_order_number = purchase_order_number;
		this.purchase_order_name = purchase_order_name;
		this.purchase_order_description = purchase_order_description;
		this.supplier_category = supplier_category;
		this.supplier_name = supplier_name;
		this.part_type = part_type;
		this.quantity = quantity;
		this.unit_price = unit_price;
		this.total_price = total_price;
		this.delivery_date = delivery_date;
		this.payment_terms = payment_terms;
		this.shipping_method = shipping_method;
		this.terms_and_conditions = terms_and_conditions;
		this.approval_status = approval_status;
		this.purchase_order_status = purchase_order_status;
	}
	public Purchase_Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Purchase_Order [purchase_order_number=" + purchase_order_number + ", purchase_order_name="
				+ purchase_order_name + ", purchase_order_description=" + purchase_order_description
				+ ", supplier_category=" + supplier_category + ", supplier_name=" + supplier_name + ", part_type="
				+ part_type + ", quantity=" + quantity + ", unit_price=" + unit_price + ", total_price=" + total_price
				+ ", delivery_date=" + delivery_date + ", payment_terms=" + payment_terms + ", shipping_method="
				+ shipping_method + ", terms_and_conditions=" + terms_and_conditions + ", approval_status="
				+ approval_status + ", purchase_order_status=" + purchase_order_status + "]";
	}

	
	
	
}
