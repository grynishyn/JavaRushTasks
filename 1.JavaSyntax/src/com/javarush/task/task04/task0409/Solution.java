package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int aa = 10 - a;
        int bb = 10 - b;
        if (abs(aa) > abs(bb) ){
            System.out.println(b);
        }
        else if (abs(aa) < abs(bb)){
            System.out.println(a);
        }
        else {
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}