package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Pet {
    private static String name;
    private static String type;

    public pet (String name, String type){
        this.name = name;
        this.type = type;
    }

    public static void speak(String output, Object... args) {
        System.out.printf(output + "\n", args);
    }

    public static String setName(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        name = scanner.nextLine();
        return name;
    }

    public static String setType(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        type = scanner.nextLine();
        return type;
    }

    public static String getName(String prompt) {
        return name;
    }

    public static String getType(String prompt) {
        return type;
    }

    public class cat extends Pet(String name,String type, int age,) {
        String catSpeak = "meow";


    }

    public class dog extends Pet(String name,String type, int age,) {
        String dogSpeak = "woof";


    }

    public class fish extends Pet(String name,String type, int age,) {
        String fishSpeak = "blub blub";


    }

    public class bird extends Pet(String name,String type, int age,) {
        String catSpeak = "caw caw";


    }
}
