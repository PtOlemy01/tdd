package com.example.tdd.multi;

public class Dollar {
    int amount = 0;

    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
}
