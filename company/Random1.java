package com.company;
import java.util.Random;
public class Random1 {
        public static void main(String[] args) {
            Random r = new Random();
            int n = r.nextInt(99)+1;
            System.out.println(n);
        }
    }

