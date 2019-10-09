package com.redis.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductRequestVO {
    @JsonProperty("products")
    List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
