package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sN = br.readLine();
        int nN = Integer.parseInt(sN);

        System.out.println("Я буду зарабатывать $" + nN + " в час");
    }
}
