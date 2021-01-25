package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        Reader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        ArrayList<String> list = new ArrayList<String>();
        for (int j = 0; j<10; j++){
            list.add(br.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for(String x: result){
            System.out.println(x);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш
        ArrayList<String> doubleText = new ArrayList<String> ();

        for (int i = 0; i < list.size(); i++){
            doubleText.add(list.get(i));
            doubleText.add(list.get(i));
        }
        return doubleText;
    }
}
