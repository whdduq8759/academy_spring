package com.spring.core.quiz;

import org.springframework.stereotype.Component;

@Component
public class LgMonitor implements Monitor{
    @Override
    public void info() {
        System.out.println("Lg 모니터 입니다.");
    }
}
