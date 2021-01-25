package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set wordSet = new HashSet();
        for (int i = 0; i < 20; i++){
            String txt = "Лена";
            wordSet.add(txt+i);
        }
        return wordSet;
    }

    public static void main(String[] args) {

    }
}
