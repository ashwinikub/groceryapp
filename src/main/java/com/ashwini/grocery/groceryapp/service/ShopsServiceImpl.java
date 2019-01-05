package com.ashwini.grocery.groceryapp.service;

import com.ashwini.grocery.groceryapp.domain.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ShopsServiceImpl implements ShopsService {

     public List<Shop> getAllShops(){
         List<Shop> shops = new ArrayList<Shop>();
         Shop shop1=new Shop();
         shop1.setName("Whole Foods");
         shops.add(shop1);

         Shop shop2=new Shop();
         shop2.setName("haldi Foods");
         shops.add(shop2);



         Shop shop3=new Shop();
         shop3.setName("patelFoods");
         shops.add(shop3);


         return shops;
    }
}
