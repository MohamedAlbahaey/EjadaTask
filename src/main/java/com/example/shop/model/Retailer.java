package com.example.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Retailer {

    @Id
    private int retailerId;
    private String name;
    private int prodId;

    public Retailer() {
    }

    public Retailer(int retailerId, String name, int prodId) {
        this.retailerId = retailerId;
        this.name = name;
        this.prodId = prodId;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    @Override
    public String toString() {
        return "Retailer{" +
                "retailerId=" + retailerId +
                ", name='" + name + '\'' +
                ", prodId=" + prodId +
                '}';
    }
}
