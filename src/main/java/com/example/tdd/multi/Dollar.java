package com.example.tdd.multi;

public class Dollar extends Money{
    private String currency;
    Dollar(int amount){
        this.amount = amount;
        this.currency = "USD";
    }
    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
    String currency(){
        return currency;
    }
}
