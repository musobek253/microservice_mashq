package com.example.froud.service;

import com.example.froud.model.FraudChekHistory;
import com.example.froud.repo.FraudChekHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {
    private final FraudChekHistoryRepository fraudChekHistoryRepository;

    public boolean isFraudulentCustomer(Integer customerId){
        fraudChekHistoryRepository.save(
                FraudChekHistory.builder()
                        .isFraudster(false)
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .build()

        );
        return false;
    }
}
