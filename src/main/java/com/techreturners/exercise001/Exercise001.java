package com.techreturners.exercise001;
import java.util.HashMap;
public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!

    public int singles(int [] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        long s1 = 0, s2 = 0;
        for(int x = 0; x < arr.length; x++){
            if(!hm.containsKey(arr[x])){
                s1 += arr[x];
                hm.put(arr[x], 1);
            }
            s2 += arr[x];
        }
        return (int)(2* s1 - s2);
    }
}
