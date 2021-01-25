package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        int sum = 0;

        while (true) {
            String numAndText = bf.readLine();



            if (numAndText.equals("сумма")) {
                break;
            } else {
                int num = Integer.parseInt(numAndText);
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}