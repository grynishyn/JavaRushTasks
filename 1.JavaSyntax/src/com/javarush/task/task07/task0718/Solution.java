package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>();
        for (int j = 0; j<10; j++){
            list.add(br.readLine());
        }
        int lengthText = list.get(0).length();
        int indexText = 0;
        for ( int i = 0; i < list.size(); i++){
            if (lengthText <= list.get(i).length()){
                lengthText = list.get(i).length();
            }
            else if (lengthText > list.get(i).length()){
                indexText = i;
                System.out.println(indexText);
                break;
            }
        }
    }
}