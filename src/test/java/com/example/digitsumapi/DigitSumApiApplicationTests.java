package com.example.digitsumapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DigitSumApiApplicationTests {

    @Autowired
    public DigitSumController controller;

    @Test
    public void getSumTest(){
        assertEquals(this.controller.getSum(1234), 10);
    }

}
