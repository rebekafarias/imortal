package com.imortal;

public class Werewolf extends Character {

    public Werewolf(String name) {
        super(name);
    }

    @Override
    public int calculateDamage() {
        return super.calculateDamage() + 15;
    }

    @Override
    public String toString() {
        return "Werewolf " + super.toString();
    }
}
