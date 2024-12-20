package com.imortal;

import java.time.LocalDateTime;

public class Character {
    private String name;
    private LocalDateTime dateOfDeath;
    private int level;

    public Character(String name) {
        this.name = name;
        this.dateOfDeath = LocalDateTime.now();
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateOfDeath() {
        return dateOfDeath;
    }

    public int getLevel() {
        return level;
    }

    public void increaseLevel() {
        level++;
    }

    public void gainExperience() {
        increaseLevel();
    }

    public int calculateDamage() {
        return level * 10;
    }

    @Override
    public String toString() {
        return name + " (Level: " + level + ", Date of Death: " + dateOfDeath + ")";
    }
}
