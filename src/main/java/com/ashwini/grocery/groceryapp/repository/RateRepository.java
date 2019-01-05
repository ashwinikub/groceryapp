package com.ashwini.grocery.groceryapp.repository;

import com.ashwini.grocery.groceryapp.domain.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository<Rate, Integer> {
}
