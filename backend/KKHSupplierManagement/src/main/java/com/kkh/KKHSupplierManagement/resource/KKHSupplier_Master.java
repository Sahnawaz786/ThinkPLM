package com.kkh.KKHSupplierManagement.resource;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class KKHSupplier_Master {


	
	   @Id
		@GeneratedValue
		private Long id;
		private String category;
		private String name;
		private String description;
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		private Date createdDate;
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		private Date modifiedDate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
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
		
		
		
		
}
