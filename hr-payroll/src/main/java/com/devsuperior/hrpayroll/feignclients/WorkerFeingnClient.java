package com.devsuperior.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.hrpayroll.enttities.Worker;



@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeingnClient {
	
	@GetMapping (value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
