package com.sparta.mnm.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeApplication {
    public static void main(String[] args) {
        System.out.println(encodeString("aaaabcccaaa"));
    }

    public static String encodeString(String plainText) {
        char[] plainChar = plainText.toCharArray();
        StringBuilder temp = new StringBuilder();
        int currentCount = 1;
        for (int i = 0; i < plainChar.length; i++) {
            if (i == plainChar.length-1) {
                temp.append(currentCount);
                temp.append(plainChar[i]);
            }else if (plainChar[i] != plainChar[i+1]) {
                temp.append(currentCount);
                temp.append(plainChar[i]);
                currentCount = 1;
            }else {
                currentCount++;
            }
        }
        return temp.toString();
    }
}