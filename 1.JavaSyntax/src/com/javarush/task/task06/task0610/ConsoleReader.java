package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();

        return text;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();
        int number = Integer.parseInt(text);

        return number;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();
        double numberD = Double.parseDouble(text);

        return numberD;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();
        boolean trueOrFalse = Boolean.parseBoolean(text);

        return trueOrFalse;

    }

    public static void main(String[] args) throws Exception {

    }
}
