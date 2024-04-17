package com.kkh.KKHSupplierManagement.resource;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PartUsageLink {

	@Id
	@GeneratedValue()
	private Long id;

	private Long ida3a5;

	private Long ida3b5;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIda3a5() {
		return ida3a5;
	}

	public void setIda3a5(Long ida3a5) {
		this.ida3a5 = ida3a5;
	}

	public Long getIda3b5() {
		return ida3b5;
	}

	public void setIda3b5(Long ida3b5) {
		this.ida3b5 = ida3b5;
	}

	public PartUsageLink(Long id, Long ida3a5, Long ida3b5) {
		super();
		this.id = id;
		this.ida3a5 = ida3a5;
		this.ida3b5 = ida3b5;
	}

	public PartUsageLink() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PartUsageLink [id=" + id + ", ida3a5=" + ida3a5 + ", ida3b5=" + ida3b5 + "]";
	}

	
	
}
