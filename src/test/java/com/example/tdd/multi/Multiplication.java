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
    공용 equals ( 완료 )
    공용 times
    Franc과 Dollar 비교하기 ( 완료 )
    통화 ?     ( 완료 )
    testFrancMultiplication을 지워야 할까?
    */

public class Multiplication {

    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);

        Assertions.assertEquals(Money.dollar(10), five.times(2));
        Assertions.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5, null);

        Assertions.assertEquals(Money.franc(10), five.times(2));
        Assertions.assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        //Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        Assertions.assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        Assertions.assertTrue(Money.franc(5).equals(Money.franc(5)));
        Assertions.assertFalse(Money.franc(5).equals(Money.franc(6)));
        Assertions.assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency(){
        Assertions.assertEquals("USD", Money.dollar(1).currency());
        Assertions.assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality(){
        Assertions.assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }

}
