package com.javarush.task.task02.task0217;

/*
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int y;
        int z = min(a, b);
        if (z <= c && z <= d )
            y = z;
        else if (c <= z && c <= d)
            y = c;
        else
            y = d;

        return y;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int x;

        if (a <= b)
            x = a;
        else
            x = b;

        return  x;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}