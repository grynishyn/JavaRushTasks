package com.javarush.task.task03.task0322;


/* 
Большая и чистая
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
        String name3 = br.readLine();

        System.out.println(name1 + " " + name2 + " " + name3 + " " +" = Чистая любовь, да-да!");
    }
}