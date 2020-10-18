package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bo.CustomerDetailsBO;
import com.example.demo.bo.InvoiceDetailsBO;
import com.example.demo.bo.ProductDetailsBO;

@Service
public class CustomerDataService {

	public List<CustomerDetailsBO> getAllCustomersDetails() {
		ArrayList<CustomerDetailsBO> customerList = new ArrayList<>();
		
		ArrayList<ProductDetailsBO> prodcutsList = new ArrayList<>();
		ProductDetailsBO productDetails = new ProductDetailsBO();
		productDetails.setProductId("00001");
		prodcutsList.add(productDetails);
		
		ArrayList<InvoiceDetailsBO> customerInvoicesList = new ArrayList<>();
		InvoiceDetailsBO invoiceDetails = new InvoiceDetailsBO();
		invoiceDetails.setInvoiceId("Invoice_20190001");
		invoiceDetails.setDateSkey(20200723);
		invoiceDetails.setPaid(2500.00);
		invoiceDetails.setUnpaid(00.00);
		invoiceDetails.setTotalPrice(2500.00);
		invoiceDetails.setPaymentStatus("Paid");
		invoiceDetails.setProdcutsList(prodcutsList);
		customerInvoicesList.add(invoiceDetails);
		
		CustomerDetailsBO customerDetailsBO = new CustomerDetailsBO();
		customerDetailsBO.setCustomerId("201900001");
		customerDetailsBO.setCustomerName("Mahesh Ghuge");
		customerDetailsBO.setAddress("Ghotan");
		customerDetailsBO.setCustomerInvoicesList(customerInvoicesList);
		customerList.add(customerDetailsBO);
		
		customerDetailsBO = new CustomerDetailsBO();
		customerDetailsBO.setCustomerId("201900002");
		customerDetailsBO.setCustomerName("Bharat Gadhe");
		customerDetailsBO.setAddress("Shevgaon");
		customerList.add(customerDetailsBO);
		
		customerDetailsBO = new CustomerDetailsBO();
		customerDetailsBO.setCustomerId("201900003");
		customerDetailsBO.setCustomerName("Aditya Dikshit");
		customerDetailsBO.setAddress("Nashik");
		customerList.add(customerDetailsBO);
		
		return customerList;
	}

}
