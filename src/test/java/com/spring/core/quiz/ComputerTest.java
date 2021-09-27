package com.spring.core.quiz;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    @Test
    void comTest() {
        ApplicationContext ct = new AnnotationConfigApplicationContext(ComputerConfig.class);
        Computer computer = ct.getBean(Computer.class);
        computer.showParts();
    }
}