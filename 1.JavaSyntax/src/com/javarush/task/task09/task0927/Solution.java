package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> nameCatMap = new HashMap<String, Cat>();
        nameCatMap.put("Первый", new Cat("Первый"));
        nameCatMap.put("Второй", new Cat("Второй"));
        nameCatMap.put("Третий", new Cat("Третий"));
        nameCatMap.put("Четвертый", new Cat("Четвертый"));
        nameCatMap.put("Пятый", new Cat("Пятый"));
        nameCatMap.put("Шестой", new Cat("Шестой"));
        nameCatMap.put("Седьмой", new Cat("Седьмой"));
        nameCatMap.put("Восьмой", new Cat("Восьмой"));
        nameCatMap.put("Девятый", new Cat("Девятый"));
        nameCatMap.put("Десятый", new Cat("Десятый"));
        return nameCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<Cat>();
        for (Map.Entry<String,Cat> pair : map.entrySet()){
            Cat valueCat = pair.getValue();
            catSet.add(valueCat);
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
