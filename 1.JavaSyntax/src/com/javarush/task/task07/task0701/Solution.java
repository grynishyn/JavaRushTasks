package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array1 = new int[20];
        for (int i = 0; i < array1.length; i++){
            array1[i] = Integer.parseInt(br.readLine());
        }

        return array1;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxNum = array[0];

        for (int j = 1; j < array.length; j++){
            if(array[j] > maxNum){
                maxNum = array[j];
            }
        }

        return maxNum;
    }
}
