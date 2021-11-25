package com.example.tdd.multi;

public class Bank {
    Money reduce(Expression source, String to){
        Sum sum = (Sum) source;
        int amount = sum.addend.amount + sum.addend.amount;

        return new Money(amount, to);
    }
}
