package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader bf = new BufferedReader(isr);

        String name = bf.readLine();
        int y = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

        System.out.println("Меня зовут "+name + ".");
        System.out.println("Я родился "+ d + "." + m + "."+ y );

    }
}
