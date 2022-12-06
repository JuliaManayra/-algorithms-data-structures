package org.data.struture;

import java.util.ArrayList;

public class QueueArrayslist {
    private int indexOffront;
    private int indexOfLast;
    private ArrayList<Integer> queue;



    public QueueArrayslist(){
        this.queue = new ArrayList<>();
        this.indexOffront = 0;
        this.indexOfLast =  0;
    }



    public void printAllElementsOfQueue(){
        for (int i = indexOffront; i < indexOfLast; i++) {
            System.out.println(this.queue.get(i));
        }
    }

    public void setValueOnQueue(int value){
        this.queue.add(indexOfLast,value);
        indexOfLast++;
    }

    public int getValueOnQueue(){
        if(indexOffront+1 < this.queue.size()) {
            indexOffront++;
            return this.queue.get(indexOffront);
        }
        System.out.println("Limit of Array exceeded.");
        return 0;
    }
}
