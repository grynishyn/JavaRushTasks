package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] domArray = new int[15];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <domArray.length;i++){
            domArray[i]= Integer.parseInt(br.readLine());
            if (i %2 == 0  || i == 0){
                sumEven = sumEven + domArray[i];
            }
            else{
                sumOdd = sumOdd + domArray[i];;
            }
        }

        if(sumEven > sumOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (sumEven < sumOdd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
