package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurant implements Restaurant{

    private final Chef chef;

    public FrenchRestaurant(Chef chef) {
        System.out.println("프랑스레스트로랑 생성자 호출");
        this.chef = chef;
    }


    @Override
    public void orderDinner() {
        System.out.println("저녁식사를 프랑스요리로 주문합니다람쥐");
        chef.cook();
    }
}
