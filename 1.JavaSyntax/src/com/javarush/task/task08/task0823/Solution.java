package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.regex.Pattern;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        ArrayList<String> wordStringList = new ArrayList<String>();

        for (String word: string.trim().split("\\s+")){
            String upperWord = word.substring(0,1).toUpperCase()+word.substring(1, word.length());
            wordStringList.add(upperWord);
        }

        String result = String.join(" ", wordStringList);
        System.out.println(result);
    }
}