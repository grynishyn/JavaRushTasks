package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String sYear = bf.readLine();
        int nYear = Integer.parseInt(sYear);

        if (nYear % 400 == 0 ){
            System.out.println("количество дней в году: 366");
        }
        else if (nYear % 100 == 0){
            System.out.println("количество дней в году: 365");
        }
        else if (nYear % 4 == 0){
            System.out.println("количество дней в году: 366");
        }
        else {
            System.out.println("количество дней в году: 365");
        }
    }
}