package com.ashwini.grocery.groceryapp.service;

import com.ashwini.grocery.groceryapp.domain.Item;

import java.util.List;

public interface ItemsService {

    List<Item> getAllItems();

    Item getAnItem(String itemName);

    void createItem(Item item);
}
