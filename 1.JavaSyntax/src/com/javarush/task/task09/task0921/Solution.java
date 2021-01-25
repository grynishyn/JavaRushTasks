package com.javarush.task.task09.task0921;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        while (true){
            try {
                int number = Integer.parseInt(br.readLine());
                numberList.add(number);
            }
            catch (NumberFormatException |IOException nfe){
                for (Integer x : numberList){
                    System.out.println(x);
                }
                return;
            }
        }
    }
}