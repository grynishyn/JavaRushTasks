package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set catsAndDogs = new HashSet();
        for (Cat addCats: cats){
            catsAndDogs.add(addCats);
        }
        for (Dog addDog: dogs){
            catsAndDogs.add(addDog);
        }
        return catsAndDogs;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Cat> itrCat = cats.iterator();

        while (itrCat.hasNext()){
            Cat checkCat = itrCat.next();
            Iterator<Object> itrPets = pets.iterator();
            while (itrPets.hasNext()){
                Object checkPetsIsItCat = itrPets.next();
                if (checkPetsIsItCat.equals(checkCat)){
                    itrPets.remove();
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object prntPets : pets){
            System.out.println(prntPets);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
