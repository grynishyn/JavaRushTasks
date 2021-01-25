package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Character> charVowelsList = new ArrayList<Character>();
        ArrayList<Character> charСonsonantList = new ArrayList<Character>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] charTextArray = text.toCharArray();
        for (int i = 0; i < charTextArray.length; i++){
            if (Character.isSpaceChar(charTextArray[i])) {
                continue;
            }
            if(isVowel(charTextArray[i])){
                charVowelsList.add(charTextArray[i]);
            }
            else {
                charСonsonantList.add(charTextArray[i]);
            }
        }
        for (int i = 0; i < charVowelsList.size(); i++){
            System.out.print(charVowelsList.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < charСonsonantList.size(); i++){
            System.out.print(charСonsonantList.get(i) + " ");
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}