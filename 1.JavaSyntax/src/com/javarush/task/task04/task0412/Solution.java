package com.javarush.task.task04.task0412;

/*
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String sNum = bf.readLine();
        int nNum = Integer.parseInt(sNum);

        if (nNum > 0){
            System.out.println( nNum * 2);
        }
        else if(nNum < 0){
            System.out.println(nNum + 1);
        }
        else {
            System.out.println(nNum);
        }
    }

}