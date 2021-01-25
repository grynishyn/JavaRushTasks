package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg z1 = new Zerg();
        z1.name = "One";
        Zerg z2 = new Zerg();
        z2.name = "Two";
        Zerg z3 = new Zerg();
        z3.name = "Three";
        Zerg z4 = new Zerg();
        z4.name = "Four";
        Zerg z5 = new Zerg();
        z5.name = "Five";

        Protoss p1 = new Protoss();
        p1.name = "One";
        Protoss p2 = new Protoss();
        p2.name = "Two";
        Protoss p3 = new Protoss();
        p3.name = "Three";

        Terran t1 = new Terran();
        t1.name = "One";
        Terran t2 = new Terran();
        t2.name = "Two";
        Terran t3 = new Terran();
        t3.name = "Three";
        Terran t4 = new Terran();
        t4.name = "Four";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
