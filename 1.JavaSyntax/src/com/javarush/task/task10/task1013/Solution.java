package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int height;
        private int weight;
        private String city;
        private String country;

        public Human(){

        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name, int age, String city){
            this.name = name;
            this.age = age;
            this.city = city;
        }
        public Human(String name, String city){
            this.name = name;
            this.city = city;
        }
        public Human(String name, String city, String country){
            this.name = name;
            this.city = city;
            this.country = country;
        }
        public Human(String name, String city, int age,int weight){
            this.name = name;
            this.city = city;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public Human(String name, int age,int weight,int height){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;

        }
        public Human(String name, int age,int weight,int height,String city, String country){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.city = city;
            this.country = country;
        }
    }
}
