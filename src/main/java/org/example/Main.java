package org.example;

import CharacterSetup.PlayerCharacter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerCharacter newPlayer = new PlayerCharacter();

        System.out.println("");



        System.out.println("Welcome to the Holiday Inn!");
        System.out.println("I'm sure you're all wondering why I summoned you here today.. However, who are you again?");
        Scanner input = new Scanner(System.in);
        newPlayer.setName(input.nextLine());



        System.out.println("Hello world!");
    }
}