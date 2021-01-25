package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        TreeMap <String, Double> map = new TreeMap<>();

        while (file.ready()){
            String readFile = file.readLine();
            String [] tmp = readFile.split(" ");
            if (map.containsKey(tmp[0])){
                map.put(tmp[0], map.get(tmp[0])+Double.parseDouble(tmp[1]));
            }
            else{
                map.put(tmp[0], Double.parseDouble(tmp[1]));
            }
        }

        file.close();

        //show data
        for (Map.Entry<String, Double> pair: map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}


