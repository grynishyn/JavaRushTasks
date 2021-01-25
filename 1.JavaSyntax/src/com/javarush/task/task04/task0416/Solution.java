package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String sT = bf.readLine();
        double nTd = Double.parseDouble(sT);

        if (nTd % 5 >= 0 && nTd % 5 < 3){
            System.out.println("зелёный");
        }
        else if(nTd % 5 >= 3 && nTd % 5 < 4){
            System.out.println("жёлтый");
        }
        else if (nTd % 5 >= 4 && nTd % 5 < 5){
            System.out.println("красный");
        }
    }
}