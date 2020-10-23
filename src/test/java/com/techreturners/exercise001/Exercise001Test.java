package com.techreturners.exercise001;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Exercise001Test {
        @Test
        public void checkSingles() {
            Exercise001 ex001 = new Exercise002();
            assertEquals(15, ex001.singles(new int []{4,5,7,5,4,8}));
            assertEquals(19, ex001.singles(new int []{9, 10, 19, 13, 19, 13}));
            assertEquals(12, ex001.singles(new int []{16, 0, 11, 4, 8, 16, 0, 11}));
        }
}