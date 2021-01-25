package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()) break;
            list.add(s);
        }

/*        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
*/
        // write code
        ArrayList<String> listDoubleTriple = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length()%2 == 0){
                listDoubleTriple.add(s + " " + s);
                //listDoubleTriple.add(s);
            }
            else{
                listDoubleTriple.add(s + " " + s + " " + s);
                //listDoubleTriple.add(s);
                //listDoubleTriple.add(s);
            }

        }

        for (int i = 0; i < listDoubleTriple.size(); i++) {
            System.out.println(listDoubleTriple.get(i));
        }
    }
}
