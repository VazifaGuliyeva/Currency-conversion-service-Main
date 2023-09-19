package com.example.currencyexchangeservice.entity;

import java.math.BigDecimal;

public class CurrencyExchange {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversional;
    private  String environment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversional) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversional = conversional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversional() {
        return conversional;
    }

    public void setConversional(BigDecimal conversional) {
        this.conversional = conversional;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "currencyExchange{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversional=" + conversional +
                '}';
    }
}
