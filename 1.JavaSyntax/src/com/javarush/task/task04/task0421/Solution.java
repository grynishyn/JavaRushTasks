package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String name1 = br.readLine();
        String name2 = br.readLine();

        int n1 = name1.length();
        int n2 = name2.length();

        if (name1.equals(name2) == true && n1 == n2 ){
            System.out.println("Имена идентичны");
        }
        else if (name1.equals(name2) == false && n1 == n2 ){
            System.out.println("Длины имен равны");
        }
    }
}
