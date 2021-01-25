package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> lastnameCost = new HashMap<String, Integer>();
        lastnameCost.put("Куть", 500);
        lastnameCost.put("Гринишин", 550);
        lastnameCost.put("Алибеков", 600);
        lastnameCost.put("Зозуля", 450);
        lastnameCost.put("Шевченко", 12000);
        lastnameCost.put("Прокопенко", 300);
        lastnameCost.put("Бущан", 400);
        lastnameCost.put("Дмитрук", 2000);
        lastnameCost.put("Ярмоленко", 50000);
        lastnameCost.put("Гринишина", 1500);

        return lastnameCost;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Integer> entry = itr.next();
            if (entry.getValue()<500){
                itr.remove();
            }
        }


    }

    public static void main(String[] args) {

    }
}