package com.ashwini.grocery.groceryapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ITEMS")
public class Item {


    private String name;


    private long pluCode;


    private Set<Rate> rates;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getPluCode() {
        return pluCode;
    }

    public void setPluCode(long pluCode) {
        this.pluCode = pluCode;
    }

    @OneToMany(mappedBy = "item",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    public Set<Rate> getRates() {
        return rates;
    }

    public void setRates(Set<Rate> rates) {
        this.rates = rates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
