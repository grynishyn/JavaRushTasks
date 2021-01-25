package com.javarush.task.task18.task1820;

/* 
Округление чисел

Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//          FILES FOR TEST
//          String fileName1 = "c:/1.txt";
//          String fileName2 = "c:/2.txt";
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        //READ FILE
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader f1 = new BufferedReader(new FileReader(fileName1));
        while (f1.ready())
            list.add(f1.readLine());
        f1.close();

        //PARSING AND ROUNDING DATA
        ArrayList<Long> values = new ArrayList<Long>();
        for (String s : list) {
            for (String part : s.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }
        f1.close();

        //Запись в файл
        FileWriter f2 = new FileWriter(fileName2);
        for (Long value : values)
            f2.write( value.toString()+" ");

        f2.close();
    }
}
