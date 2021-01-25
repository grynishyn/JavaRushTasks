package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList <String> textArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            textArrayList.add(br.readLine());
        }
        for ( int j = 0; j < 13; j++){
            String lastRow = textArrayList.get(4);
            textArrayList.remove(4);
            textArrayList.add(0,lastRow);
        }
        for (int k = 0; k < 5; k++){
            System.out.println(textArrayList.get(k));
        }
    }
}
