package com.sda.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;


public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void init(){
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        //given
        //Calculator calculator = new Calculator();
        //when
        int sum = calculator.sum(3,5);
        //then
        Assert.assertEquals("result is not 8", 8, sum);
    }

    @Test
    public void testSub(){
//        //given
//        Calculator calculator = new Calculator();
        int sub = calculator.sub(5,3);

        Assert.assertEquals("Substraction is not equal 2", 2, sub);
    }

    @Test
    public void testMultiply(){
//        //given
//        Calculator calculator = new Calculator();
//        int multiply = calculator.multiply(5,3);

       // Assert.assertEquals(15, multiply);
    }

    @Test
    public void testDivision(){
//        //given
//        Calculator calculator = new Calculator();
//        int division = calculator.division(10,5);
        //Assert.assertEquals(2, division);
    }
}
