package com.company;

public class Main {

    public static void main(String[] args) {
        Factory chairs = new Factory();
        Client client = new Client();
        System.out.println(client.sit(chairs.createVictorianChair()));
        System.out.println(client.sit(chairs.createMultifunctionalChair()));
        System.out.println(client.sit(chairs.createMagicChair()));
    }
}