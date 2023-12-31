package com.example.currencyexchangeservice.repository;

import com.example.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {


    CurrencyExchange findByFromAndTo(String from,String to);
}
