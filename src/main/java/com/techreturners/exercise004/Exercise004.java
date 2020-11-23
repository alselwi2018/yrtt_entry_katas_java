package com.techreturners.exercise004;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
public class Exercise004 {

     // Move the first letter of each word to the end of it, then add "ay" to the end of the word. 
    // Leave punctuation marks untouched.

    public String pigLatin(String str) {
        return Pattern.compile(" +").splitAsStream(str).map(s->s.matches("[a-zA-Z!]+") ? s.substring(1)+ s.charAt(0) + "ay": s)
        .collect(Collectors.joining(" "));
    }
}
