package com.ashwini.grocery.groceryapp.controller;

import com.ashwini.grocery.groceryapp.domain.Item;
import com.ashwini.grocery.groceryapp.domain.Shop;
import com.ashwini.grocery.groceryapp.service.ItemsService;
import com.ashwini.grocery.groceryapp.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ShopsController {

    @Autowired
    private ShopsService shopsService;

    @GetMapping("/shops")
    public List<Shop> getAllShops() {
        return shopsService.getAllShops();

    }
}
