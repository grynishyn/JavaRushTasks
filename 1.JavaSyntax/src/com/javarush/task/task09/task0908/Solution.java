package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException re){
            System.out.println("NullPointerException has been caught");
        }


        //напишите тут ваш код
    }
}
