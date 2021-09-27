package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component
public class ChineseRestaurant implements Restaurant{

    private final Chef chef;

    public ChineseRestaurant(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void orderDinner() {
        System.out.println("중국요리 주문");
        chef.cook();
    }
}
