package com.ashwini.grocery.groceryapp.controller;

import com.ashwini.grocery.groceryapp.domain.Item;
import com.ashwini.grocery.groceryapp.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemsContoller {


    @Autowired
    private ItemsService itemsService;

    @GetMapping
    public List<Item>  getAllItems(){
        return itemsService.getAllItems();

    }

    @GetMapping("/{itemName}")
    public Item getAnItem(@PathVariable("itemName") String itemName){
        return itemsService.getAnItem(itemName);
    }

    @PostMapping
    public void createItem(@RequestBody Item item){
        itemsService.createItem(item);
    }

}
