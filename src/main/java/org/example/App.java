package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] first_array = {1,15,20};

        int [] second_array = {};

        second_array = first_array;


        System.out.println("Elements from First Array :- " +  Arrays.toString(first_array));
        System.out.println("Elements from Second Array :- " + Arrays.toString(second_array));


    }
}
