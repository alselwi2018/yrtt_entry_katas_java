package com.techreturners.exercise002;
import java.util.concurrent.TimeUnit;
public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
       int hh =(int)TimeUnit.HOURS.toMillis(h);
        int mm = (int)TimeUnit.MINUTES.toMillis(m);
        int ss = (int)TimeUnit.SECONDS.toMillis(s);
        return hh + mm + ss;
    }
}
