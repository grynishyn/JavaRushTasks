package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++ ){
            array[i]=Integer.parseInt(reader.readLine());
        }

        for (int n = array.length-1; n > 0; n--){
            for (int i = 0; i < n ; i++) {
                if(array[i]>array[i+1]){
                    int temporalPeremen = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temporalPeremen;
                }
            }
        }

        for (int i:array){
            System.out.println(i);
        }
    }
}
