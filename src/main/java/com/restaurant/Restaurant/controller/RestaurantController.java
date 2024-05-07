package com.restaurant.Restaurant.controller;
import com.restaurant.Restaurant.model.Restaurant;
import com.restaurant.Restaurant.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {

    @Autowired
    MySqlRepository mySqlRepository;

    @GetMapping("/get-all-restaurants")
    public List<Restaurant> getAllRestaurants() {
        return mySqlRepository.findAll();
    }

    @GetMapping("/get-restaurant/{identity}")
    public Restaurant getSingleRestaurant(@PathVariable("identity") Integer id) {
        return mySqlRepository.findById(id).get();
    }

    @DeleteMapping("/remove/{identity}")
    public void deleteRestaurant(@PathVariable("identity") Integer id) {
        mySqlRepository.deleteById(id);
    }

    @PutMapping("/update/{identity}")
    public Restaurant updateRestaurant(@PathVariable("identity") Integer id, @RequestBody Map<String, String> body) {

        Restaurant current = mySqlRepository.findById(id).get();
        if (body.containsKey("nome")){
            current.setNome(body.get("nome"));
        };
        if (body.containsKey("preco")){
            current.setPreco(Double.parseDouble(body.get("preco")));
        };
        if (body.containsKey("pontosPositivos")){
            current.setPontosPositivos(body.get("pontosPositivos"));
        };
        if (body.containsKey("pontosNegativos")){
            current.setPontosNegativos(body.get("pontosNegativos"));
        };
        if (body.containsKey("notaA")){
            current.setNotaA(Double.parseDouble(body.get("notaA")));
        };
        if (body.containsKey("notaM")){
            current.setNotaM(Double.parseDouble(body.get("notaM")));
        };
        if (body.containsKey("notaG")){
            current.setNotaG(Double.parseDouble(body.get("notaG")));
        };
        mySqlRepository.save(current);

        return current;
    }

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Map<String, String> body) {

         Restaurant restaurant = new Restaurant();
         restaurant.setNome(body.get("nome"));
         restaurant.setPreco(Double.parseDouble(body.get("preco")));
         restaurant.setPontosPositivos(body.get("pontosPositivos"));
         restaurant.setPontosNegativos(body.get("pontosNegativos"));
         restaurant.setNotaA(Double.parseDouble(body.get("notaA")));
         restaurant.setNotaM(Double.parseDouble(body.get("notaM")));
         restaurant.setNotaG(Double.parseDouble(body.get("notaG")));


         return mySqlRepository.save(restaurant);

    }

}