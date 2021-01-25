package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch(IndexOutOfBoundsException sie){
            System.out.println("IndexOutOfBoundsException has been caught");
        }

        //напишите тут ваш код
    }
}