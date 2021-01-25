package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        try{
            FileInputStream fileReader = new FileInputStream(reader.readLine());
            while (fileReader.available() > 0) {
                char ch = (char) fileReader.read();
                if (ch == ',') {
                    count++;
                }
            }
            fileReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("File can not read");
        }
        System.out.println(count);
    }
}