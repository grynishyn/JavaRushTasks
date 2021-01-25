package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int x = 0;
        if (this.age != anotherCat.age) {
            if (this.age > anotherCat.age) {
                x++;
            }
            else x--;
        }
        if (this.weight !=anotherCat.weight) {
            if (this.weight >anotherCat.weight) {
                x++;
            }
            else x--;
        }
        if (this.strength !=anotherCat.strength) {
            if (this.strength > anotherCat.strength) {
                x++;
            }
            else x--;
        }

        if (x > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {

    }
}