package com.spring.core.oop.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
// 주문 정보 객체
public class Order {

    private Long memberId; // 주문한 회원 아이디
    private String itemName; // 상품명
    private int itemPrice; // 상품 금액
    private  int discountPrice; // 할인액

}
