package com.epam.brest.price;

import java.math.BigDecimal;
import java.util.Map;

public class Price {
    private String namePriceList;
    private BigDecimal entity;
    private BigDecimal price;
    private Map<Integer ,BigDecimal> prices;

    public Price(String namePriceList, Map<Integer, BigDecimal> prices) {
        this.namePriceList = namePriceList;
        this.prices = prices;
    }

    public String getNamePriceList() {
        return namePriceList;
    }

    public void setNamePriceList(String namePriceList) {
        this.namePriceList = namePriceList;
    }

    public BigDecimal getEntity() {
        return entity;
    }

    public void setEntity(BigDecimal entity) {
        this.entity = entity;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public BigDecimal getPrice( BigDecimal entity) {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Map<Integer, BigDecimal> getPrices() {
        return prices;
    }

    public void setPrices(Map<Integer, BigDecimal> prices) {
        this.prices = prices;
    }
    /*public BigDecimal choosePrise(BigDecimal inputValue){

    }*/
}
