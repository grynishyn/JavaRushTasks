package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String name1 = br.readLine();
        String sAge = br.readLine();
        int nAge = Integer.parseInt(sAge);

        if (nAge < 18 ){
            System.out.println("Подрасти еще");
        }
    }
}
