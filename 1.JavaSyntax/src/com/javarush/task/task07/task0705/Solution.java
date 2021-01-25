package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[20];
        int[] numArray1 = new int[10];
        int[] numArray2 = new int[10];

        for (int i = 0; i <numArray.length;i++){
            numArray[i]= Integer.parseInt(br.readLine());
            if (i < 10){
                numArray1[i] = numArray[i];
            }
            else{
                numArray2[i-10] = numArray[i];
            }
        }
        for (int j = 0; j < numArray2.length; j++){
            System.out.println(numArray2[j]);
        }
    }
}
