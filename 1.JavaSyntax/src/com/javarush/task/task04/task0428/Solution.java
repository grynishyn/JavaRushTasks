package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is =  System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sA = br.readLine();
        int nA = Integer.parseInt(sA);
        String sB = br.readLine();
        int nB = Integer.parseInt(sB);
        String sC = br.readLine();
        int nC = Integer.parseInt(sC);

        if ( nA > 0 && nB > 0 && nC > 0){
            System.out.println( "3");
        }
        else if((nA <= 0 && nB > 0 && nC > 0) || ( nA > 0 && nB <= 0 && nC > 0) || ( nA > 0 && nB > 0 && nC <= 0) ){
            System.out.println("2");
        }
        else if((nA <= 0 && nB <= 0 && nC > 0) || ( nA > 0 && nB <= 0 && nC <= 0) || ( nA <= 0 && nB > 0 && nC <= 0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
