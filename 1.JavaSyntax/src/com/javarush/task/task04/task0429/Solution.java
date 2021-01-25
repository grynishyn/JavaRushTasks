package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sA = br.readLine();
        int nA = Integer.parseInt(sA);
        String sB = br.readLine();
        int nB = Integer.parseInt(sB);
        String sC = br.readLine();
        int nC = Integer.parseInt(sC);

        int p = 0;
        int o = 0;

        if (nA > 0) {
            p = p + 1;
        } else if (nA < 0) {
            o = o + 1;
        }
        if (nB > 0) {
            p = p + 1;
        } else if (nB < 0) {
            o = o + 1;
        }
        if (nC > 0) {
            p = p + 1;
        } else if (nC < 0) {
            o = o + 1;
        }
        System.out.println("количество отрицательных чисел: " + o);
        System.out.println("количество положительных чисел: " + p);
    }
}