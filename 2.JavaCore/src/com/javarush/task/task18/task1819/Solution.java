package com.javarush.task.task18.task1819;

/* 
Объединение файлов

Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//  FILES FOR TEST
//        String fileName1 = "c:/1.txt";
//        String fileName2 = "c:/2.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        // read first file
        FileInputStream fr1 = new FileInputStream(fileName1);
        int fileData1 = 0;
        byte[] buff1 = new byte[fr1.available()];
        while (fr1.available()>0){
            fileData1 = fr1.read(buff1);
        }
        fr1.close();

        FileOutputStream fw1 = new FileOutputStream(fileName1);
        FileInputStream fr2 = new FileInputStream(fileName2);


        while (fr2.available()>0){
            byte[] buff2 = new byte[fr2.available()];
            fr2.read(buff2);
            fw1.write(buff2);
        }
        fw1.write(buff1, 0 , fileData1);
        fr2.close();
        fw1.close();
    }
}