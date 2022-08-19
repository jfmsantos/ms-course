package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.enttities.Payment;
import com.devsuperior.hrpayroll.enttities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkerFeingnClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeingnClient workerFeingnClient;
	
	public Payment getPayment(long workerId, int days) {
		
		
		Worker worker = workerFeingnClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}