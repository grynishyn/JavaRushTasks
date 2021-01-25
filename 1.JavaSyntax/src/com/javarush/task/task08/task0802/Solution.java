package com.javarush.task.task08.task0802;

/* 
Map из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> textTextMap = new HashMap<String, String>();

        textTextMap.put("арбуз","ягода");
        textTextMap.put("банан","трава");
        textTextMap.put("вишня","ягода");
        textTextMap.put("груша","фрукт");
        textTextMap.put("дыня","овощ");
        textTextMap.put("ежевика","куст");
        textTextMap.put("жень-шень","корень");
        textTextMap.put("земляника","ягода");
        textTextMap.put("ирис","цветок");
        textTextMap.put("картофель","клубень");

        for (Map.Entry<String, String> textText : textTextMap.entrySet()){
            String key = textText.getKey();
            String value = textText.getValue();
            System.out.println(key + " - "+value);
        }

    }
}