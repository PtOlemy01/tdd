package com.example.tdd.multi;

public class Dollar {
    int amount = 0;

    Dollar(int amount){
        this.amount = amount;
    }
    void times(int multiplier){
        amount *= multiplier;
    }
}
