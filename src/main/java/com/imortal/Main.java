package com.imortal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create the first character (Vampire):");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();

        Character character1 = new Vampire(name1);

        System.out.println("Create the second character (Werewolf):");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();

        Character character2 = new Werewolf(name2);

        Character winner = Battle.fight(character1, character2);

        System.out.println("New level of " + winner.getName() + ": " + winner.getLevel());
    }
}
