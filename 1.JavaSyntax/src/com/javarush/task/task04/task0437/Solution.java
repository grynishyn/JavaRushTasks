package com.javarush.task.task04.task0437;


/*
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //int x = 1;

        for ( int x = 1 ; x <= 10; x++ ){
            for (int y =1; y <= x; y ++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}