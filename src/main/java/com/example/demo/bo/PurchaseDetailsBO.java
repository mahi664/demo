package com.example.demo.bo;

import java.util.ArrayList;
import java.util.List;

public class PurchaseDetailsBO {
	private 	int 							dateSkey;
	private 	String 							vendor;
	
	private 	ArrayList<ProductDetailsBO>		productsList = 		null;

	public int getDateSkey() {
		return dateSkey;
	}

	public void setDateSkey(int dateSkey) {
		this.dateSkey = dateSkey;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public List<ProductDetailsBO> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<ProductDetailsBO> productsList) {
		this.productsList = (ArrayList<ProductDetailsBO>) productsList;
	}
	
	
}
