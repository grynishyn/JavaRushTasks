package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

/*
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList<String> textArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            textArrayList.add(br.readLine());
        }
        textArrayList.remove(2);
        for (int j = (textArrayList.size() - 1); j >= 0; j--){
            System.out.println(textArrayList.get(j));
        }
    }
}