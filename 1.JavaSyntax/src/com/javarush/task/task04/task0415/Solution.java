package com.javarush.task.task04.task0415;

/* 
Правило треугольника
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
        String sC = bf.readLine();
        int nC = Integer.parseInt(sC);

        if ( nA >= (nB + nC)){
            System.out.println("Треугольник не существует.");
        }
        else if(nB >= (nA + nC)){
            System.out.println("Треугольник не существует.");
        }
        else if(nC >= (nA + nB)){
            System.out.println("Треугольник не существует.");
        }
        else {
            System.out.println("Треугольник существует.");
        }

    }
}