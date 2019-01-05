package com.ashwini.grocery.groceryapp.service;

import com.ashwini.grocery.groceryapp.domain.Item;
import com.ashwini.grocery.groceryapp.domain.Rate;
import com.ashwini.grocery.groceryapp.domain.Shop;
import com.ashwini.grocery.groceryapp.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsRepository itemsRepository;

   /* @Override
    public List<Item> getAllItems() {


        Shop wholeFoods = new Shop();
        wholeFoods.setName("WholeFoods");

        Shop stopAndShop = new Shop();
        stopAndShop.setName("stop and shop");

        Shop costco = new Shop();
        costco.setName("costco");

        Rate rate1 = new Rate();
        rate1.setPrice(1.99);
        rate1.setShop(wholeFoods);

        Rate rate2 = new Rate();
        rate2.setPrice(2.99);
        rate2.setShop(stopAndShop);

        Rate rate3 = new Rate();
        rate3.setPrice(2.09);
        rate3.setShop(costco);



        Item apple=new Item();
        apple.setName("apple");
        apple.setRates(Arrays.asList(rate1, rate2, rate3));


        Item mango = new Item();
        mango.setName("mango");
        mango.setRates(Arrays.asList(rate1, rate2, rate3));


        Item milk = new Item();
        milk.setName("milk");
        milk.setRates(Arrays.asList(rate1, rate2, rate3));


        List<Item>  items = new ArrayList<>();
        items.add(apple);
        items.add(mango);
        items.add(milk);

        return items;

    }*/

    @Override
    public List<Item> getAllItems() {

        return itemsRepository.findAll();

    }

    @Override
    public Item getAnItem(String itemName) {
/*

        Shop wholeFoods = new Shop();
        wholeFoods.setName("WholeFoods");

        Shop stopAndShop = new Shop();
        stopAndShop.setName("stop and shop");

        Shop costco = new Shop();
        costco.setName("costco");

        Rate rate1 = new Rate();
        rate1.setPrice(1.99);
        rate1.setShop(wholeFoods);

        Rate rate2 = new Rate();
        rate2.setPrice(2.99);
        rate2.setShop(stopAndShop);

        Rate rate3 = new Rate();
        rate3.setPrice(2.09);
        rate3.setShop(costco);



        Item apple=new Item();
        apple.setName("apple");
        apple.setRates(Arrays.asSet(rate1, rate2, rate3));

        return apple;
*/
         return null;

    }

    @Override
    public void createItem(Item item) {
        itemsRepository.save(item);
    }
}
