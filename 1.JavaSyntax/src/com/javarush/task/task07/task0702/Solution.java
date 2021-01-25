package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] textArray = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <8;i++){
            textArray[i]= br.readLine();
        }
        for (int j = (textArray.length - 1); j >= 0;j--){
            System.out.println(textArray[j]);
        }

    }
}