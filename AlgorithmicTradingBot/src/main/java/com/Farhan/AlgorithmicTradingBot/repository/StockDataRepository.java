package com.Farhan.AlgorithmicTradingBot.repository;

import com.Farhan.AlgorithmicTradingBot.model.StockData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDataRepository extends JpaRepository<StockData, Long>
{

}
