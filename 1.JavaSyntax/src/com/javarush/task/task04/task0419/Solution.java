package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        String sD = br.readLine();
        int nD = Integer.parseInt(sD);

        if (nA >= nB && nA >= nC && nA >= nD){
            System.out.println(nA);
        }
        else if (nB >= nA && nB >= nC && nB >= nD){
            System.out.println(nB);
        }
        else if (nC >= nA && nC >= nB && nC >= nD){
            System.out.println(nC);
        }
        else if (nD >= nA && nD >= nB && nD >= nC){
            System.out.println(nD);
        }
    }
}
