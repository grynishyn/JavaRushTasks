package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Создаем Map
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer,Integer> mapOfByte = new HashMap<>();
        int valueByte = 0;
        Integer countByte = 0;
        while (fileInputStream.available() > 0){
            valueByte = fileInputStream.read();
            countByte = mapOfByte.get(valueByte);
            if (countByte !=null){
                countByte++;
            }
            else {
                countByte = 0;
            }
            mapOfByte.put(valueByte,countByte);
        }
        fileInputStream.close();
        //Находим максимальное число повторений
        int max = Collections.max(mapOfByte.values());
        //Выводим максимальное бит
        for (Map.Entry pair : mapOfByte.entrySet()) {
            if (max == (int) pair.getValue())
                System.out.print(" " + pair.getKey());
        }
    }
}
