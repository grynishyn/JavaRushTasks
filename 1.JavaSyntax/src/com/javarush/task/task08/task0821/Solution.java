package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> fioMap = new HashMap<String, String>();
        fioMap.put("Гринишин", "Игорь");
        fioMap.put("Гринишин", "Вадим");
        fioMap.put("Куть", "Богдан");
        fioMap.put("Чех", "Ирина");
        fioMap.put("Чех", "Вася");
        fioMap.put("Зозуля", "Марина");
        fioMap.put("Гринишина", "Татьяна");
        fioMap.put("Гринишин", "Александр");
        fioMap.put("Зозуля", "Андрей");
        fioMap.put("Шевченко", "Андрей");

        return fioMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
