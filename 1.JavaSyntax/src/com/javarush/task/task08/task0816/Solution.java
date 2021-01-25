package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Гринишин", dateFormat.parse("JULY 1 2013"));
        map.put("Гринишина", dateFormat.parse("JUNE 1 2014"));
        map.put("Чех", dateFormat.parse("SEPTEMBER 1 2019"));
        map.put("Куть", dateFormat.parse("JANUARY 1 2002"));
        map.put("Зозуля", dateFormat.parse("MARCH 1 2008"));
        map.put("Тойота", dateFormat.parse("OCTOBER 1 2011"));
        map.put("Грот", dateFormat.parse("AUGUST 1 2012"));
        map.put("Карандаш", dateFormat.parse("FEBRUARY 1 2018"));
        map.put("Мазда", dateFormat.parse("JULY 1 2015"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String,Date>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Date> pair = itr.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
    //    removeAllSummerPeople(createMap());
    }
}
