package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            FileOutputStream file3 = new FileOutputStream(reader.readLine());
            int fileSize = file1.available();
            int part1FileSize = fileSize / 2;

            if (fileSize %2 ==0){
                byte[] buf1 = new byte[part1FileSize];
                byte[] buf2 = new  byte[fileSize - part1FileSize];

                file1.read(buf1);
                file1.read(buf2);
                file2.write(buf1);
                file3.write(buf2);
            }
            else {
                byte[] buf1 = new byte[part1FileSize + 1];
                byte[] buf2 = new  byte[fileSize - (part1FileSize + 1)];

                file1.read(buf1);
                file1.read(buf2);
                file2.write(buf1);
                file3.write(buf2);
            }
            file1.close ();
            file2.close ();
            file3.close ();
        }

        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            System.out.println("File can not read");
        }
    }
}
