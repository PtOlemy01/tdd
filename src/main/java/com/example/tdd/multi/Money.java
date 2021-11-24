package com.example.tdd.multi;

public abstract class Money {
    protected int amount;
    protected String currency;

    String currency(){
        return currency;
    }

    static Money dollar(int amount){
        return new Dollar(amount);
    }

    static Money franc(int amount){
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object){
        Money money = (Money)object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
