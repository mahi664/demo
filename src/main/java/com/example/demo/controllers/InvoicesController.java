package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.InvoiceDetailsBO;
import com.example.demo.services.InvoicesDataService;

@RestController
public class InvoicesController {
	
	@Autowired
	private InvoicesDataService invoicesDataService;
	
	@GetMapping(path="/get-all-invoices")
	public List<InvoiceDetailsBO> getAllInvoices(){
		return invoicesDataService.getAllInvoices();
	}
	
	@GetMapping(path="/get-invoices-by-criteria/{paymentStatus}/{dateSkey}/{invoiceId}")
	public List<InvoiceDetailsBO> getInvoicesByCriteria(@PathVariable String paymentStatus, @PathVariable int dateSkey, @PathVariable String invoiceId){
		return invoicesDataService.getInvoicesByCriteria(paymentStatus, dateSkey, invoiceId);
	}
}
