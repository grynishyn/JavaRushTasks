package com.javarush.task.task06.task0611;

/*
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        for (int i = 1; i<=5; i++){
            result = result+s;
            //System.out.print(s);
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код

        for (int i = 1; i<=count; i++){
            result = result+s;
            //System.out.print(s);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("You are the BEST!!!"));
        System.out.println(StringHelper.multiply("Who are you?",3));

    }
}