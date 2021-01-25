package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        ArrayList<String> numList = new ArrayList<String>();
        ArrayList<String> textList = new ArrayList<String>();
        for (int i = 0;i < array.length; i++)
        {
            if (isNumber(array[i]))
                numList.add(array[i]);
            else
                textList.add(array[i]);}
        // Collections.sort(list1);
        // Collections.reverse(list1);
        String tempor = null;
        int k = 0;
        for (int i = 0; i < numList.size(); i++, k++) {
            for (int j = k; j < numList.size(); j++) {
                if (Integer.parseInt(numList.get(j)) > Integer.parseInt(numList.get(i))) {
                    tempor = numList.get(j);
                    numList.set(j, numList.get(i));
                    numList.set(i, tempor);
                }
            }
        }
        // Collections.sort(list2);
        String temp = null;
        int z = 0;
        for (int i = 0; i < textList.size(); i++, z++) {
            for (int j = z; j < textList.size(); j++) {
                if (isGreaterThan(textList.get(i), textList.get(j))) {
                    temp = textList.get(j);
                    textList.set(j, textList.get(i));
                    textList.set(i, temp);
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (numList.size() > 0) {
                array[i] = numList.get(0);
                numList.remove(0);
            } else {
                array[i] = textList.get(0);
                textList.remove(0);
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}