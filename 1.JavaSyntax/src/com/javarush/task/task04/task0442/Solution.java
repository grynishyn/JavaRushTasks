package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        //int x = Integer.parseInt(bf.readLine());
        int sum = 0;
        while (true){
            int x = Integer.parseInt(bf.readLine());

            if (x != -1){
                sum = sum + x;
            }
            else{
                sum = sum +x;
                break;
            }
        }
        System.out.println(sum);
    }
}
