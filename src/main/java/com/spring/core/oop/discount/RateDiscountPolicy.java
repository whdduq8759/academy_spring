package com.spring.core.oop.discount;



import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;

/*
 *  정률 할인 정책
 *  책임: vip회원에게 정해진 비율만큼의 할인액을 적용해준다.
 * */
// 아 월요병 졸리다.....................................
public class RateDiscountPolicy implements DiscountPolicy{

    //할인율
    private static final double DISCOUNT_RATE = 0.2;

    @Override
    public int discount(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP) {
            return (int)DISCOUNT_RATE * itemPrice;
        } else {
            return 0;
        }
    }
}
