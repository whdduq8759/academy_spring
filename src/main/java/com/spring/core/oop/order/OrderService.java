package com.spring.core.oop.order;

import com.spring.core.oop.discount.DiscountPolicy;
import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;

// 역할: 적당한 회원저장소에서 회원 정보를 조회한 후
//      회원등급에 따라 적당한 할인정책을 적용한 주문을 생성하는 책임
public class OrderService {

    private MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    public OrderService(MemberRepository memberRepository) {

    }

    public void OrderService(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;

    }



    // 주문 기능
//    public Order createOrder(Long id, String itemName, int price) {
//        Member member = memberRepository.findById(id);
//        Grade grade = member.getGrade();
//        // 주문 생성 할인 적용
//        switch (grade) {
//            case VIP:
//                return new Order(id, itemName, price, discountPolicy.discount(member, price));
//
//            case BASIC:
//            break;
//        }
//    }
}
