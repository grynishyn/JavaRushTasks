package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++)
        {
            String s = br.readLine();
            strings.add(s);
        }
        int maxText = strings.get(0).length();
        for (int j = 1; j < 5; j++)
        {
            if (strings.get(j).length()>maxText){
                maxText = strings.get(j).length();
            }
        }
        for (int k = 0; k < 5; k++){
            if (strings.get(k).length() == maxText){
                maxText = strings.get(k).length();
                System.out.println(strings.get(k));
            }
        }
    }
}
