package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] textArray = new String[10];
        int[] numArray = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < textArray.length;i++){
            textArray[i]= br.readLine();
            numArray[i] = textArray[i].length();

        }
        for (int j = 0; j < numArray.length;j++){
            System.out.println(numArray[j]);
        }
    }
}
