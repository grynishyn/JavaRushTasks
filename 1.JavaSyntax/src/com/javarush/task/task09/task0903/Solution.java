package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();

        return ste[2].getLineNumber();// /*напишите тут ваш код*/ 0;
    }
}
