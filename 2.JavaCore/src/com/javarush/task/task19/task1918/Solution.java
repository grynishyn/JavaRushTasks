package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = conReader.readLine();
        conReader.close();

        //read file
        BufferedReader fileBufReader = new BufferedReader(new FileReader(fileName));
        StringBuffer content = new StringBuffer();
        while (fileBufReader.ready()){
            content.append(fileBufReader.readLine());
        }
        fileBufReader.close();
        StringBuffer text = new StringBuffer(content.toString().replaceAll("\r\n",""));

        String tagOpen = "<" + args[0];
        String tagClose = "</" + args[0] + ">";

        int positionOpen = -1;
        int positionClose = -1;
        int shift = -1;
        Stack<Integer> openedTags = new Stack<>();
        Map<Integer, Integer> tags = new TreeMap<>(new MyComparator());
        while (true) {
            positionOpen = text.indexOf(tagOpen, shift);
            positionClose = text.indexOf(tagClose, shift);
            if (positionOpen < 0 && positionClose < 0)
                break;

            if (positionOpen != -1 && positionOpen < positionClose) { //Open ближе чем close
                openedTags.push(positionOpen);
                shift = positionOpen + tagOpen.length();
                continue;
            }

            if (positionClose != -1 && (positionOpen > positionClose || positionOpen == -1)) { //Close ближе чем open
                if (openedTags.isEmpty())
                    break;
                tags.put(openedTags.pop(), positionClose + tagClose.length());
                shift = positionClose + tagClose.length();
            }
        }

        for (Map.Entry<Integer, Integer> pair : tags.entrySet()) {
            System.out.println(text.substring(pair.getKey(), pair.getValue()));
        }

    }
    static class MyComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    }
}