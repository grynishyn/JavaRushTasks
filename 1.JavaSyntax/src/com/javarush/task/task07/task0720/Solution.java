package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> textArrayList = new ArrayList<>();

        for (int i=0; i < n; i++){
            textArrayList.add(reader.readLine());
        }
        for (int j = 0; j < m; j++){
            String text = textArrayList.get(0);
            textArrayList.remove(0);
            textArrayList.add(text);
        }
        for(String s : textArrayList){
            System.out.println(s);
        }
    }
}