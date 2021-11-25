package com.example.tdd.multi;

public class Bank {
    Money reduce(Expression source, String to){
        return source.reduce(to);
    }
}
