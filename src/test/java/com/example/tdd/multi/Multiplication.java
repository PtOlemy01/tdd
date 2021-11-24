package com.example.tdd.multi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    TODO
    $5 + 10CHF = $10(환율이 2:1일 경우)
    $5 * 2 = $10  ( 완료 )
    amount 를 private로 만들기   (완료)
    Dollar 부작용? ( 완료 )
    Money 반올리?
    equals()        ( 완료 )
    hashCode()
    Equal null
    Equal object
    5CHF * 2 = 10 CHF ( 완료 )
    Dollar / Franc 중복
    공용 equals
    공용 times
    */

public class Multiplication {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);

        Assertions.assertEquals(new Dollar(10), five.times(2));
        Assertions.assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);

        Assertions.assertEquals(new Franc(10), five.times(2));
        Assertions.assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        //Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assertions.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}
