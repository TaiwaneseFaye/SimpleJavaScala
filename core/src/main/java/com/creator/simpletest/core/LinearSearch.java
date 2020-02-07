package com.creator.simpletest.core;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] data, int key){
        //for loop to take the variable key and match it against the
        // data structure one index at a time until a match is found
        for(int i=0;i<data.length;i++){
            if(data[i]==key){
                return i;
            }
        }
        return -1;  //if variable key passed does not belong to data structure a -1 one will be returned

    }

    public static void main(String args[]){
        //creating scanner object
        Scanner userKey = new Scanner(System.in);
        //created a data structure with random placement of numbers from 1-20
        int[] data = {19,6,17,9,11,20,3,8,15,2,14,7,12,16,4,10,1,5,13,6,12,18};
        //asking the user for a random number from 1-20
        System.out.println("Please choose a number from 1-20.");
        //the key will be a random number from 1-20 asked from by the user to conduct the linear search
        int key = userKey.nextInt();
        //print out the results after passing the variables to the LinearSearch Class
        System.out.println(key+" is found at index: "+linearSearch(data, key));
    }
}
