package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String name1 = br.readLine();
        String sAge = br.readLine();
        int nAge = Integer.parseInt(sAge);

        if (nAge > 20 ){
            System.out.println("И 18-ти достаточно");
        }
    }
}
