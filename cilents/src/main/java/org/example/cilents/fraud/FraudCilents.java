package org.example.cilents.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("fraud")
public interface FraudCilents {

    @GetMapping(path = "api/v1/fraud-check/{customerId}")
     FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId);

}
