package com.javarush.task.task04.task0424;

/*
Три числа
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

        if(nA == nB && nA != nC){
            System.out.println(3);
        }
        else if (nB ==nC && nB!=nA){
            System.out.println(1);
        }
        else if (nC ==nA && nC!=nB){
            System.out.println(2);
        }
    }
}