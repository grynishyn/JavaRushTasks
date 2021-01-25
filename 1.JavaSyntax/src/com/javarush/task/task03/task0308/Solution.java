package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел

(!!! простой способ!!!)
public class Solution
{
    public static void main(String[] args)
    {   int x = 1*2*3*4*5*6*7*8*9*10;
        System.out.println(x);
        //напишите тут ваш код
    }
}

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i;
        int x = 1;

        for (i = 1; i<=10; i++){
            x = x*i;
            //i = i*x;

        }
        System.out.println(x);

    }
}
