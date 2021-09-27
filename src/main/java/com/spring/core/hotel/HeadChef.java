package com.spring.core.hotel;

import org.springframework.stereotype.Component;

@Component
public class HeadChef implements Chef{
    @Override
    public void cook() {
        System.out.println("주방장 생성자 호출");
        System.out.println("선임주방장이 요리합니다리미");
    }


}
