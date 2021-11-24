package com.example.tdd.multi;

public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money)object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
