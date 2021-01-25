package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> textArrayList = new ArrayList<>();
        textArrayList.add("мама");
        textArrayList.add("мыла");
        textArrayList.add("раму");
        textArrayList.add(1,"именно");
        textArrayList.add(3,"именно");
        textArrayList.add(5,"именно");

        for (int i = 0; i < textArrayList.size(); i++){
            System.out.println (textArrayList.get(i));
        }
    }
}
