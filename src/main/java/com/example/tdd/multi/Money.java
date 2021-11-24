package com.example.tdd.multi;

public abstract class Money {
    protected int amount;
    protected String currency;

    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object){
        Money money = (Money)object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
