package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        int score = 0;
        double sum = 0;

        while(true){
            int x = Integer.parseInt(br.readLine());

            if(x == -1){
                break;
            }
            else {
                score++;
                sum = sum + x;
            }
        }

        double a = sum/score;
        System.out.print(a);
    }
}

