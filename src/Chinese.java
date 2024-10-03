public class Chinese extends Languages implements WhatIneedtotake {
    public Chinese() {
        super("Chinese", 10000000, 65);
    }


    String languages = "Chinese";
    static String state = "China";
    String capital = "Beijing";
    static int ageofstate = 35000;
    // метод SeyHello
    public void seyHello(String name) {
        System.out.println("你好" + " - Hello");
    }
    //метод
    public static void AgeofChina() {
        if (ageofstate == 35000) {
            System.out.println("You in the " + state);
        } else {
            System.out.println("You in another state");
        }

    }

    protected void ChineseInfo2(String name, int people, int countries) {
        System.out.println(name + " is spoken by " + countries + " and " + people + " milions people");
    }

    protected void ChineseInfo() {
        System.out.println(capital + " is the capital of China");
        System.out.println("In China, the official language is " + languages);

    }
    //интерфейс
    @Override
    public void take() {
        System.out.println("You need to take:");
        String[] elements = {"money-钱","good mood-好心情"};
        for (String s: elements) {
            System.out.println(s);
        }



    }
}




