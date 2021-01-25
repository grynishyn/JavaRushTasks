package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[10];

        for (int i = 0; i <numArray.length;i++){
            numArray[i]= Integer.parseInt(br.readLine());
        }
        for (int j = (numArray.length - 1); j >= 0;j--){
            System.out.println(numArray[j]);
        }


    }
}

