package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mounthInput = br.readLine();
        Map<Integer,String> mounthMap = new HashMap<Integer,String>();
        mounthMap.put(1,"January");
        mounthMap.put(2,"February");
        mounthMap.put(3,"March");
        mounthMap.put(4,"April");
        mounthMap.put(5,"May");
        mounthMap.put(6,"June");
        mounthMap.put(7,"July");
        mounthMap.put(8,"August");
        mounthMap.put(9,"September");
        mounthMap.put(10,"October");
        mounthMap.put(11,"November");
        mounthMap.put(12,"December");

        if(mounthMap.containsValue(mounthInput)){
            for (Map.Entry<Integer, String> pair : mounthMap.entrySet())
            {
                Integer key = pair.getKey();                      //ключ
                String value = pair.getValue();                  //значение
                if(value.equals(mounthInput)){
                    System.out.println(value + " is the " + key + " month");
                }

            }
        }
    }
}
