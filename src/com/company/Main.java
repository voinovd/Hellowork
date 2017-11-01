package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("123");// write your code here
        System.out.println(123);
        String mystr="abc";
        int[] newarray=new int[50];
        Random rand = new Random();

        int max = 50;
        int min = 1;

        for (int i=0; i<newarray.length;i++){
            newarray[i]=rand.nextInt(max) + min;
        }
        System.out.println(Arrays.toString(newarray));

    }
}
