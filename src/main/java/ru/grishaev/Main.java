package ru.grishaev;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    private static String getMessage(){
        var faker = new Faker();
        return "Hello, " + faker.name().firstName() + "!";
    }
}