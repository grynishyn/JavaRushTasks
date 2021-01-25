package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is =  System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sNum = br.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum > 0 && nNum < 1000){
            if (nNum % 2 == 0){
                if(nNum / 100 >=1 ){
                    System.out.println("четное трехзначное число");
                }
                else if (nNum / 10 >= 1){
                    System.out.println("четное двузначное число");
                }
                else{
                    System.out.println("четное однозначное число");
                }
            }
            else {
                if(nNum / 100 >=1 ){
                    System.out.println("нечетное трехзначное число");
                }
                else if (nNum / 10 >= 1){
                    System.out.println("нечетное двузначное число");
                }
                else{
                    System.out.println("нечетное однозначное число");
                }
            }
        }
    }
}