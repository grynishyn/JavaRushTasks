package com.javarush.task.task18.task1823;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты

Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = null;
        while (true) {
            s = reader.readLine();
            if (s.equals("exit")){
                break;
            }
            ReadThread th = new ReadThread(s);
            th.start();

        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private byte findedByte;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @Override
        public void run() {
            HashMap<Byte, Integer> fMap = new HashMap<Byte, Integer>();
            try{
                FileInputStream f = new FileInputStream( this.fileName);
                while (f.available() > 0) {
                    byte[] buf = new byte[f.available()];
                    f.read(buf);

                    for (byte b : buf) {
                        if (fMap.containsKey(b))
                            fMap.put(b, fMap.get(b) + 1);
                        else
                            fMap.put(b, 1);
                    }
                }
                f.close();
            }
            catch (FileNotFoundException e){
                e.getMessage(); }
            catch (IOException e){
                e.getMessage();
            }
            // Find Byte
            int max = 0;
            for (Map.Entry<Byte, Integer> pair : fMap.entrySet()) {
                if (max < pair.getValue()) {
                    this.findedByte = pair.getKey();
                    max = pair.getValue();
                }
            }

            synchronized (resultMap) {
                resultMap.put(this.fileName, new Integer(this.findedByte));
            }
        }
    }
}
