package com.ashwini.grocery.groceryapp.domain;

import javax.persistence.*;

@Entity
@Table(name = "RATES")
public class Rate {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    public int getRateId() {
        return rateId;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }


    private int rateId;


    private Item item;

    private double price;


    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "ITEM_PLU_CODE",insertable = true, nullable = false)
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SHOP_NAME")
    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }


}
