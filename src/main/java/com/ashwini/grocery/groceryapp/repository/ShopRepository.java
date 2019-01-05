package com.ashwini.grocery.groceryapp.repository;

import com.ashwini.grocery.groceryapp.domain.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, String> {
}
