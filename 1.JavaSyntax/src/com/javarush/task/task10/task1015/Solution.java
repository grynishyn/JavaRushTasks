package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("I");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("love");
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("JAVA");
        ArrayList<String>[] allArrayLists = new ArrayList[3];
        allArrayLists[0] = list1;
        allArrayLists[1] = list2;
        allArrayLists[2] = list3;

        return allArrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}