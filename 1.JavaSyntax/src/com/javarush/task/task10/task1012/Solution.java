package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        ArrayList<Integer> countCharList = new ArrayList<Integer>();
        for (Character charAlphabet: alphabet){
            int countChar = 0;
            for (String word : list ){
                char[] charWordArray = new char[word.length()];
                charWordArray = word.toCharArray();
                for (Character charWord: charWordArray){
                    if (charAlphabet.equals(charWord)){
                        countChar++;
                    }
                }
            }
            countCharList.add(countChar);
        }
        for (int i = 0; i < countCharList.size();i++){
            System.out.println(alphabet.get(i) + " " + countCharList.get(i));
        }
    }
}