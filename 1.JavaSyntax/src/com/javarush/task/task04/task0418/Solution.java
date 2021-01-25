package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
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

        if (nA > nB){
            System.out.println(nB);
        }
        else if (nB < nA){
            System.out.println(nA);
        }
        else{
            System.out.println(nA);
        }
    }
}