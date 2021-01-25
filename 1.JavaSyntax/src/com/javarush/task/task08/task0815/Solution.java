package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String,String > fioMap = new HashMap<String, String>();
        fioMap.put("Гринишин3", "Игорь");
        fioMap.put("Гринишин2", "Вадим");
        fioMap.put("Куть", "Богдан");
        fioMap.put("Чех", "Ирина");
        fioMap.put("Чех2", "Вася");
        fioMap.put("Зозуля", "Марина");
        fioMap.put("Гринишина", "Татьяна");
        fioMap.put("Гринишин", "Александр");
        fioMap.put("Зозуля2", "Андрей");
        fioMap.put("Шевченко", "Андрей");

        return fioMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countTheSameFirstName = 0;
        for (Map.Entry<String,String> check : map.entrySet()){
            String value = check.getValue();
            if (value.equals(name)){
                countTheSameFirstName++;
            }
        }
        return countTheSameFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countTheSameLastName = 0;
        for (Map.Entry<String,String> check : map.entrySet()){
            String key = check.getKey();
            if (key.equals(lastName)){
                countTheSameLastName++;
            }
        }
        return countTheSameLastName;
    }

    public static void main(String[] args) {
    /*    for (Map.Entry<String, String> pair : createMap().entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    */
    }
}
