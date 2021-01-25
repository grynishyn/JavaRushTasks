package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){
            numArrayList.add(Integer.parseInt(br.readLine()));
        }
        int countMax = 1;
        int countNum = 1;

        for (int i = 1; i < numArrayList.size(); i++){
            if(numArrayList.get(i).equals(numArrayList.get(i-1))) {
                countNum++;
                if (countNum > countMax) {
                    countMax = countNum;
                }
            }
            else if(!numArrayList.get(i).equals(numArrayList.get(i-1))){
                countNum = 1;
            }
        }
        System.out.println(countMax);
    }
}