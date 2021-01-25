package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> textArrayList = new ArrayList<>();

        for (int i = 0; i < textArrayList.size()+1; i++) {
            textArrayList.add(reader.readLine());
            if (textArrayList.get(i).equals("end")) {
                textArrayList.remove(i);
                break;
            }
        }
        for (String str : textArrayList){
            System.out.println(str);
        }
    }
}