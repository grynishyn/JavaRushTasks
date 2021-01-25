package com.javarush.task.task03.task0314;

/*
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш

        for (int a = 1; a <= 10; a++){
            int i = 1;
            while (i<=10){
                int x = i * a;
                System.out.print(x + " ");
                i++;
            }
            System.out.println();

        /* ---- Или можно сделать через два цикла FOR() ----
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
         }
        */
        }
    }
}
