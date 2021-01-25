package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> listText = new ArrayList<String>();
        listText.add("Text 1");
        listText.add("Text 2");
        listText.add("Text 3");
        listText.add("Text 4");
        listText.add("Text 5");
        int x = listText.size();

        System.out.println(x);
        for (int i = 0; i < x; i++){
            System.out.println(listText.get(i));
        }

    }
}
