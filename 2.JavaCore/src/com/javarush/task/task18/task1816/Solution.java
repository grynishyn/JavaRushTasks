package com.javarush.task.task18.task1816;

/*
Английские буквы
*/

        import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetU = alphabetL.toUpperCase();

        FileReader fr = new FileReader(args[0]);

        int count = 0;
        while (fr.ready()){
            char s = (char) fr.read();
            if ((alphabetL.indexOf(s)> -1) || (alphabetU.indexOf(s)>-1)){
                count++;
            }
        }
        fr.close();
        System.out.println(count);
    }
}
