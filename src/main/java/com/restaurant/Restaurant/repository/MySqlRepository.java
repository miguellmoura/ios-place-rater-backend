package com.restaurant.Restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.Restaurant.model.Restaurant;

public interface MySqlRepository extends JpaRepository<Restaurant, Integer>{
}
