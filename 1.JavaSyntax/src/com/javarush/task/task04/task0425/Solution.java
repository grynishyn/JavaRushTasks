package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String sA = bf.readLine();
        int nA = Integer.parseInt(sA);
        String sB = bf.readLine();
        int nB = Integer.parseInt(sB);

        if (nA > 0 && nB > 0){
            System.out.println("1");
        }
        if (nA < 0 && nB > 0){
            System.out.println("2");
        }
        if (nA < 0 && nB < 0){
            System.out.println("3");
        }
        if (nA > 0 && nB < 0){
            System.out.println("4");
        }
    }
}
