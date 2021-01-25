package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList <String> textArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            textArrayList.add(0, br.readLine());
        }
        for (String z : textArrayList){
            System.out.println(z);
        }
    }
}
