package com.example.froud.repo;

import com.example.froud.model.FraudChekHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudChekHistoryRepository extends JpaRepository<FraudChekHistory, Integer> {
}