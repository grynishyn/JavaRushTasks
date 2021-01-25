package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код

    private int  top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int top, int left){
        this.height = 0;
        this.left = left;
        this.top = top;
        this.width = 0;
    }
    public void initialize(int top, int left, int width){
        this.height = width;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(Rectangle anotherRectangle){

    }

    public static void main(String[] args) {

    }
}
