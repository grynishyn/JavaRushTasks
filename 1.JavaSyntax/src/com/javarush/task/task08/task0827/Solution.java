package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException  {
     //   Calendar cal1 = new GregorianCalendar();

        DateFormat df = new SimpleDateFormat("MMMM d YYYY", Locale.ENGLISH);
        Date givenDate = df.parse(date);
        Date yearStart = new Date(givenDate.getYear(), 0, 0);
        long interval = givenDate.getTime() - yearStart.getTime();
        long s =  (24*60*60*1000);
        int dayCounter = (int) (interval/s);
        if ((dayCounter % 2) == 1){
            return true;
        }
        else{
            return false;
        }
    }
}
