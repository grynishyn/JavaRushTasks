package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        Reader isr = new InputStreamReader (is);
        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();
        String sSum = br.readLine();
        int nSum = Integer.parseInt(sSum);
        String sYear = br.readLine();
        int nYear = Integer.parseInt(sYear);

        System.out.println(name + " получает " + nSum + " через " + nYear + " лет.");

    }
}
