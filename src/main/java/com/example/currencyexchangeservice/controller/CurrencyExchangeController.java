package com.example.currencyexchangeservice.controller;

import com.example.currencyexchangeservice.entity.CurrencyExchange;
import com.example.currencyexchangeservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;




    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange reTrieved(@PathVariable String from,@PathVariable String to){
        // CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
       CurrencyExchange currencyExchange=currencyExchangeRepository.findByFromAndTo(from,to);

        if(currencyExchange==null){
            throw new RuntimeException("Unable to data");
        }
        String port=environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);

        return currencyExchange;
    }


}
