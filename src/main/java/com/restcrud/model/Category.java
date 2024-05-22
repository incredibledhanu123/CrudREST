package com.restcrud.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long di;
	
	@Column(nullable= false, name="category_name",unique = true)
	private String cname;
	
	@Column(name="category_description")
	private String cdesc;
	
	@JsonBackReference
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<>();
	
	public Long getDi() {
		return di;
	}

	public void setDi(Long di) {
		this.di = di;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Category(Long di, String cname, String cdesc) {
		super();
		this.di = di;
		this.cname = cname;
		this.cdesc = cdesc;
	}
	
	public Category(String cname, String cdesc, List<Product> products) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
		this.products = products;
	}

	public Category() {
		
	}

	public String toString() {
		return "Category [di=" + di + ", cname=" + cname + ", cdesc=" + cdesc + ", products=" + products + "]";
	}
	
	

}
