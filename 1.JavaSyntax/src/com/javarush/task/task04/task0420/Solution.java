package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if(nA < nB && nA < nC){
            if(nB < nC ){
                System.out.println(nC + " " + nB + " " + nA);
            }
            else {
                System.out.println(nB + " " + nC + " " + nA);
            }
        }
        else if (nB < nA && nB < nC){
            if(nA < nC ){
                System.out.println(nC + " " + nA + " " + nB);
            }
            else {
                System.out.println(nA + " " + nC + " " + nB);
            }
        }
        else if (nC < nA && nC < nB){
            if(nA < nB ){
                System.out.println(nB + " " + nA + " " + nC);
            }
            else {
                System.out.println(nA + " " + nB + " " + nC);
            }
        }
    }
}
