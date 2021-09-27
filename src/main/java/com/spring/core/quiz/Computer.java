package com.spring.core.quiz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final KeyBoard keyBoard;
    private final Mouse mouse;
    private final Monitor monitor;

    @Autowired
    public Computer(KeyBoard keyBoard, Mouse mouse, Monitor monitor) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.monitor = monitor;
    }


    // 부품정보를 보여주는 메소드
    public void showParts() {
        keyBoard.info();
        monitor.info();
        mouse.info();
    }
}
