package com.example.digitsumapi;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DigitSumApiApplicationTests {

    @Autowired
    public DigitSumController controller;

    @Test
    @Order(2)
    public void getSumTest(){
        assertEquals(this.controller.getSum(1234), 10);
    }

    @Test
    @Order(1)
    public void getUsageCountTest(){

        this.controller.getSum(1234);

        assertEquals(this.controller.getUsageCount(), 1);
    }

}
