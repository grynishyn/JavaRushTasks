package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String> fioMap = new HashMap<String, String>();
        fioMap.put("Куть", "Богдан");
        fioMap.put("Гринишин", "Игорь");
        fioMap.put("Алибеков", "Саша");
        fioMap.put("Зозуля", "Андрей");
        fioMap.put("Шевченко", "Андрей");
        fioMap.put("Прокопенко", "Дима");
        fioMap.put("Бущан", "Жора");
        fioMap.put("Дмитрук", "Дима");
        fioMap.put("Ярмоленко", "Андрей");
        fioMap.put("Гринишина", "Татьяна");

        return fioMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        Iterator<Map.Entry<String, String>> itr = copy.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,String> pair = itr.next();
            String nameCheckingValue = pair.getValue();
            int count=0;
            Iterator<Map.Entry<String, String>> itrAll = copy.entrySet().iterator();
            while (itrAll.hasNext()){
                Map.Entry<String,String> entry = itrAll.next();
                if (entry.getValue().equals(nameCheckingValue)){
                    count++;
                }
            }
            if (count >= 2) {
                removeItemFromMapByValue(map, nameCheckingValue);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}