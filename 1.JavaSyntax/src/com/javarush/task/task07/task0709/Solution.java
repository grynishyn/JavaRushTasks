package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        ArrayList<String> textArrayList = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            String s = br.readLine();
            textArrayList.add(s);
        }
        int minText = textArrayList.get(0).length();
        for (int j = 1; j < 5; j++)
        {
            if (textArrayList.get(j).length()<minText){
                minText = textArrayList.get(j).length();
            }
        }
        for (int k = 0; k < 5; k++){
            if (textArrayList.get(k).length() == minText){
                minText = textArrayList.get(k).length();
                System.out.println(textArrayList.get(k));
            }
        }
    }
}