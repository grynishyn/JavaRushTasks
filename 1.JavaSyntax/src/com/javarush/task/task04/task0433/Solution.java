package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String text = "S";

        int i = 10;

        while (i > 0) {
            int num = 10;
            while (num > 0) {
                System.out.print(text);
                num--;
            }
            System.out.println();
            i--;
        }
    }
}