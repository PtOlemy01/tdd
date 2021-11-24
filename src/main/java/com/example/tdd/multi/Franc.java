package com.example.tdd.multi;

public class Franc extends Money{
    Franc(int amount){
        this.amount = amount;
    }
    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object){
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }
}
