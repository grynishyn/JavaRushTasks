package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.util.TreeSet;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Создаем Map
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        TreeSet<Integer> byteArrayList = new TreeSet<Integer>();

        while (fileInputStream.available()>0){
            byteArrayList.add(fileInputStream.read());
        }
        fileInputStream.close();

        for (Integer byteValue : byteArrayList){
            System.out.print(byteValue + " ");
        }
    }
}
