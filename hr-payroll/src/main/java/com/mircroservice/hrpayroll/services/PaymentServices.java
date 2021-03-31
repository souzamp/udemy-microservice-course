package com.mircroservice.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mircroservice.hrpayroll.entities.Payment;
import com.mircroservice.hrpayroll.entities.Worker;
import com.mircroservice.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentServices {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(Long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
