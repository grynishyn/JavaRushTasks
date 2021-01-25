package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human ded1 = new Human("Vasya", true, 54);
        Human ded2 = new Human("Sasha", true, 56);
        Human baba1 = new Human("Ira", false, 54);
        Human baba2 = new Human("Olya", false, 54);
        Human father = new Human("Igor", true, 28, ded2, baba2);
        Human mother = new Human("Tanya", false, 30, ded1, baba1);
        Human sun = new Human("Bodya", true, 9, father, mother);
        Human sun2 = new Human("Kostya", true, 2, father, mother);
        Human doughter = new Human("Olya", false, 1, father, mother);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(sun.toString());
        System.out.println(sun2.toString());
        System.out.println(doughter.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}