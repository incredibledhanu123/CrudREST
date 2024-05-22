package com.restcrud.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long di;
	
	@Column(nullable = false, unique = true, name="product_name")
	private String pname;
	
	@Column(name="quantity")
	private Integer qnt;
	
	@JsonIgnoreProperties({"products"})
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Category category;
	
	public Long getDi() {
		return di;
	}

	public void setDi(Long di) {
		this.di = di;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getQnt() {
		return qnt;
	}

	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product() {
		
	}

	public Product(Long di, String pname, Integer qnt) {
		super();
		this.di = di;
		this.pname = pname;
		this.qnt = qnt;
	}

	public Product(String pname, Integer qnt, Category category) {
		this.pname = pname;
		this.qnt = qnt;
		this.category = category;
	}

	public String toString() {
		return "Product [di=" + di + ", pname=" + pname + ", qnt=" + qnt + ", category=" + (category != null ? category.getCname() : null) + "]";
	}
	
	
}
