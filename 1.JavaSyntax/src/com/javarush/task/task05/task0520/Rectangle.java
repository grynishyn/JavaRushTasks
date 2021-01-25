package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int  top;
    private int left;
    private int width;
    private int height;

    public Rectangle(int top, int left, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(int top, int left){
        this.height = 0;
        this.left = left;
        this.top = top;
        this.width = 0;
    }
    public Rectangle(int top, int left, int width){
        this.height = width;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public Rectangle(Rectangle anotherRectangle){

    }

    public static void main(String[] args) {

    }
}
