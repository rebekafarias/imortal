package com.imortal;

public class Vampire extends Character {

    public Vampire(String name) {
        super(name);
    }

    @Override
    public int calculateDamage() {
        return super.calculateDamage() + 20;
    }

    @Override
    public String toString() {
        return "Vampire " + super.toString();
    }
}
