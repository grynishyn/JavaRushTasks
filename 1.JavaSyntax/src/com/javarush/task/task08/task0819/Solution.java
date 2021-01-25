package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catsSet = new HashSet<Cat>();
        catsSet.add(new Cat());
        catsSet.add(new Cat());
        catsSet.add(new Cat());
        return catsSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat prntCats : cats){
            System.out.println(prntCats);
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
