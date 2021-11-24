package com.example.tdd.multi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    TODO
    $5 + 10CHF = $10(환율이 2:1일 경우)
    $5 * 2 = $10  ( 완료 )
    amount 를 private로 만들기
    Dollar 부작용? ( 완료 )
    Money 반올리?
    equals()        ( 완료 )
    hashCode()
    */

public class Multiplication {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        Assertions.assertEquals(10, product.amount);
        product = five.times(3);
        Assertions.assertEquals(15, product.amount);
    }

    @Test
    public void testEquality(){
        //Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assertions.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
