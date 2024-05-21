package com.Farhan.AlgorithmicTradingBot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class StockData
{
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;
private String symbol;
private LocalDateTime lastAccessed;
private double price;
}
