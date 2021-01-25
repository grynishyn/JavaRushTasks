package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> textSet = new HashSet<>();
        textSet.add("арбуз");
        textSet.add("банан");
        textSet.add("вишня");
        textSet.add("груша");
        textSet.add("дыня");
        textSet.add("ежевика");
        textSet.add("женьшень");
        textSet.add("земляника");
        textSet.add("ирис");
        textSet.add("картофель");

        for (String txt : textSet ){
            System.out.println(txt);
        }
    }
}
