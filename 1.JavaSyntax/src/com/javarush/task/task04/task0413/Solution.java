package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String sDay = bf.readLine();
        int nDay = Integer.parseInt(sDay);

        if (nDay == 1){
            System.out.println("понедельник");
        }
        else if (nDay == 2){
            System.out.println("вторник");
        }
        else if (nDay == 3){
            System.out.println("среда");
        }
        else if (nDay == 4){
            System.out.println("четверг");
        }
        else if (nDay == 5){
            System.out.println("пятница");
        }
        else if (nDay == 6){
            System.out.println("суббота");
        }
        else if (nDay == 7){
            System.out.println("воскресенье");
        }
        else {
            System.out.println("такого дня недели не существует");
        }
    }
}