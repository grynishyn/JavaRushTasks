package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList <String> textArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            textArrayList.add(br.readLine());
        }
        int minText = textArrayList.get(0).length();
        for (int j = 1; j < 10; j++)
        {
            if (textArrayList.get(j).length()<minText){
                minText = textArrayList.get(j).length();
            }
        }
        int maxText = textArrayList.get(0).length();
        for (int j = 1; j < 10; j++)
        {
            if (textArrayList.get(j).length()>maxText){
                maxText = textArrayList.get(j).length();
            }
        }
        for (int k = 0; k < 10; k++){
            if(textArrayList.get(k).length() == minText || textArrayList.get(k).length() == maxText){
                System.out.println(textArrayList.get(k));
                break;
            }
        }
    }
}
