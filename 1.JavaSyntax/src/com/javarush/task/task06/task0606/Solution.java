package com.javarush.task.task06.task0606;

import java.io.*;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sA = br.readLine();
        int x = Math.abs(Integer.parseInt(sA));

        while (x > 0) {
            if ((x % 10) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            x = Math.round(x / 10);
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}