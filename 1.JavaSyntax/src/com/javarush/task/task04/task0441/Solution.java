package com.javarush.task.task04.task0441;


/*
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if (a <= b && a <= c){
            if (b < c ){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
        else if(b <= a && b <= c){
            if (a < c ){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else if(c <= a && c <= b){
            if (a < b ){
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
    }
}