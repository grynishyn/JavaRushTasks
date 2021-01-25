package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            while (file1.available() > 0){
                byte [] buff = new byte[file1.available()];
                byte []reversBuff = new byte[buff.length];
                file1.read(buff);
                for (int i = buff.length - 1; i >= 0; i--) {
                    reversBuff[buff.length - i -1] = buff[i];
                }
                file2.write(reversBuff);
            }
            file1.close();
            file2.close();
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("File can not read");
        }

    }
}
