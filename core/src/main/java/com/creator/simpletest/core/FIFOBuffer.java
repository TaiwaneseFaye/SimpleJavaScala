package com.creator.simpletest.core;

import java.util.LinkedList;
import java.util.Queue;

public class FIFOBuffer {
    public static void main(String[] args){
        //capacity of ArrayBlockingQueue
        Queue<Integer> q = new LinkedList<Integer>();

        //add elements to queue
        for(int i = 0;i <5;i++)
            q.add(i);

        //display contents of queue
        System.out.println("Elements of queue-" + q);


        //remove head of the queue
        int removedele = q.remove();
        System.out.println("removed element-"+removedele);

        System.out.println(q);

        //To view the head of queue
        int head = q.peek();
        System.out.println("head of queue-"+head);

        //list size of queue
        int size = q.size();
        System.out.println("Size of queue-"+size);

    }
}
