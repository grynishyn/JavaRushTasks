package com.javarush.task.task18.task1818;

/* 
Два в одном

Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        reader.close();

        FileOutputStream of1 = new FileOutputStream(fileName1);
        FileInputStream if2 = new FileInputStream(fileName2);
        FileInputStream if3 = new FileInputStream(fileName3);

        //File2 write to File1
        while (if2.available()>0){
            byte[] buff = new byte[if2.available()];
            if2.read(buff);
            of1.write(buff);
        }

        if2.close();

        //File3 append to File1
        while (if3.available()>0){
            byte[] buff = new byte[if3.available()];
            if3.read(buff);
            of1.write(buff);
        }
        if3.close();
        of1.close();
    }
}
