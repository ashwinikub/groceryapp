package com.ashwini.grocery.groceryapp.domain;

import javax.persistence.*;

@Entity
@Table(name = "SHOPS")
public class Shop {

    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @OneToOne(mappedBy = "shop")
    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }


    private Rate rate;

    private String name;

}

