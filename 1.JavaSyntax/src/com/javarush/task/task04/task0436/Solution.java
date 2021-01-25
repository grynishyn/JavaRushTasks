package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        int m = Integer.parseInt(bf.readLine());
        int n = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= m; i++){
            for(int l = 1; l <= n; l++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
