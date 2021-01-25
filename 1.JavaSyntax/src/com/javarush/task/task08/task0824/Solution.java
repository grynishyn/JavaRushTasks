package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Bodya", true, 9);
        Human child2 = new Human("Olya", false, 5);
        Human child3 = new Human("Kostya", true, 3);
        Human mama = new Human("Tanya", false, 30, child1, child2, child3);
        Human papa = new Human("Vasya", true, 27, child1, child2, child3);
        Human ded1 = new Human("Vasya", true, 53, mama);
        Human ded2 = new Human("Sasha", true, 55, papa);
        Human baba1 = new Human("Ira", false, 53, mama);
        Human baba2 = new Human("Olya", false, 53, mama);
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(mama.toString());
        System.out.println(papa.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, Human ... children){
            this.name = name;
            this.age =age;
            this.sex =sex;
            Collections.addAll(this.children,children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
