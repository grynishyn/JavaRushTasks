package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("лира"); // 2
        list.add("роза"); // 0
        list.add("лоза"); // 1

        list.add("sdfgsdfg"); // 3
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> textArrayList = new ArrayList<String>();
        for (int i =0;i < list.size(); i++) {

            if (list.get(i).contains("р") && !list.get(i).contains("л")) {

            }
            else if (!list.get(i).contains("р")  && list.get(i).contains("л")) {
                textArrayList.add(list.get(i));
                textArrayList.add(list.get(i));
            }
            else if (list.get(i).contains("р")  && list.get(i).contains("л")) {
                textArrayList.add(list.get(i));
            }
            else {
                textArrayList.add(list.get(i));
            }
        }
        return textArrayList;
    }
}