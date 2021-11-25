package com.example.tdd.multi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    Dollar / Franc 중복   ( 완료 )
    공용 equals ( 완료 )
    공용 times    ( 완료  )
    Franc과 Dollar 비교하기 ( 완료 )
    통화 ?     ( 완료 )
    testFrancMultiplication을 지워야 할까?
    */

public class Multiplication {

    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5);

        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality(){
        //Assertions.assertEquals(new Dollar(5), new Dollar(5));
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testSimpleAddition(){
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum(){
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum)result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    public void testReduceSum(){
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }
}
