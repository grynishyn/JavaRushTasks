package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if (nA == nB && nA != nC && nB !=nC){
            System.out.println(nA + " " + nB);
        }
        else if (nB == nC && nB != nA && nC !=nA){
            System.out.println(nB + " " + nC);
        }
        else if (nA == nC && nA != nB && nC !=nB){
            System.out.println(nA + " " + nC);
        }
        else if (nA == nB && nA == nC && nB ==nC){
            System.out.println(nA + " " + nB + " " + nC);
        }
    }
}