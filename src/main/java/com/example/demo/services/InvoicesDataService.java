package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bo.InvoiceDetailsBO;

@Service
public class InvoicesDataService {

	public List<InvoiceDetailsBO> getAllInvoices() {
		ArrayList<InvoiceDetailsBO> invocesList = new ArrayList<>();
		InvoiceDetailsBO invoiceDetailsBO = new InvoiceDetailsBO();
		invocesList.add(invoiceDetailsBO);
		return invocesList;
	}

	public InvoiceDetailsBO getInvoiceById(String invoiceId) {
		InvoiceDetailsBO invoiceDetailsBO = new InvoiceDetailsBO();
		invoiceDetailsBO.setInvoiceId(invoiceId);
		return invoiceDetailsBO;
	}

	public List<InvoiceDetailsBO> getInvoiceByDate(int invoiceDate) {
		ArrayList<InvoiceDetailsBO> invocesList = new ArrayList<>();
		InvoiceDetailsBO invoiceDetailsBO = new InvoiceDetailsBO();
		invoiceDetailsBO.setDateSkey(invoiceDate);
		invocesList.add(invoiceDetailsBO);
		return invocesList;
	}

	public List<InvoiceDetailsBO> getInvoicesByCriteria(String paymentStatus, int dateSkey, String invoiceId) {
		ArrayList<InvoiceDetailsBO> invoicesListByCriteria = new ArrayList<>();
		InvoiceDetailsBO invoiceDetailsBO = new InvoiceDetailsBO();
		if(paymentStatus!=null)
			invoiceDetailsBO.setPaymentStatus(paymentStatus);
		if(dateSkey!=-1)
			invoiceDetailsBO.setDateSkey(dateSkey);
		if(invoiceId!=null)
			invoiceDetailsBO.setInvoiceId(invoiceId);
		invoicesListByCriteria.add(invoiceDetailsBO);
		return invoicesListByCriteria;
	}

}
