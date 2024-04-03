package org.learn.spring_rest;

import jakarta.persistence.Entity;

@Entity
public class Number {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
