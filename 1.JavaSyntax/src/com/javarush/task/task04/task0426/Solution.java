package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
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

        if (nA < 0 && nA % 2 == 0){
            System.out.println("отрицательное четное число");
        }
        else if (nA < 0 && nA % 2 != 0){
            System.out.println("отрицательное нечетное число");
        }
        else if (nA > 0 && nA % 2 == 0){
            System.out.println("положительное четное число");
        }
        else if (nA > 0 && nA % 2 != 0){
            System.out.println("положительное нечетное число");
        }
        else if (nA == 0){
            System.out.println("ноль");
        }
    }
}