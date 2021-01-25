package com.javarush.task.task04.task0432;

/*
Хорошего много не бывает
*/

        import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String text = br.readLine();
        String sNum = br.readLine();
        int num = Integer.parseInt(sNum);


        int i = num;

        while(i > 0){
            System.out.println(text);
            i--;
        }
    }
}
