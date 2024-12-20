package com.imortal;

import java.util.Random;

public class Battle {

    public static Character fight(Character c1, Character c2) {
        Random random = new Random();

        int damageC1 = c1.calculateDamage() + random.nextInt(10);
        int damageC2 = c2.calculateDamage() + random.nextInt(10);

        System.out.println(c1 + " vs " + c2);
        System.out.println("Damage from " + c1.getName() + ": " + damageC1);
        System.out.println("Damage from " + c2.getName() + ": " + damageC2);

        if (damageC1 > damageC2) {
            c1.gainExperience();
            System.out.println(c1.getName() + " won!");
            return c1;
        } else {
            c2.gainExperience();
            System.out.println(c2.getName() + " won!");
            return c2;
        }
    }
}
