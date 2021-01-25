package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String sYear = br.readLine();
        int nYear = Integer.parseInt(sYear);
        String name = br.readLine();

        System.out.println(name + " захватит мир через " + nYear + " " + "лет. Му-ха-ха!");
    }
}
