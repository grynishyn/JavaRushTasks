package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList<Integer> numArrayList = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            numArrayList.add(Integer.parseInt(br.readLine()));
        }
        ArrayList<Integer> x3List = new ArrayList<>();
        ArrayList<Integer> x2List = new ArrayList<>();
        ArrayList<Integer> otherList = new ArrayList<>();

        for (int j = 0; j < numArrayList.size(); j++){
            int x = numArrayList.get(j);
            if (x % 3 == 0 && x % 2 == 0){
                x3List.add(x);
                x2List.add(x);
            }
            else if (x % 3 == 0){
                x3List.add(x);
            }
            else if (x % 2 == 0){
                x2List.add(x);
            }
            else {
                otherList.add(x);
            }
        }
        printList(x3List);
        printList(x2List);
        printList(otherList);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer smth : list){
            System.out.println(smth);
        }
    }
}
