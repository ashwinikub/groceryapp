package com.ashwini.grocery.groceryapp.repository;

import com.ashwini.grocery.groceryapp.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Item, Long> {
}
