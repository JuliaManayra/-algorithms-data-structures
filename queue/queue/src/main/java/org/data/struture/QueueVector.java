package org.data.struture;

public class QueueVector {

    private int indexOffront;
    private int indexOfLast;
    private int[] queue;



    public QueueVector(int sizeQueue){
        this.queue = new int[sizeQueue];
        this.indexOffront = 0;
        this.indexOfLast =  0;
    }



    public void printAllElementsOfQueue(){
        for (int i = indexOffront; i < indexOfLast; i++) {
            System.out.println(this.queue[i]);
        }
    }

    public void setValueOnQueue(int value){
        if(indexOfLast+1 < this.queue.length) {
            this.queue[indexOfLast] = value;
            indexOfLast++;
        }else {
            System.out.println("Limit of Array exceeded.");
        }
    }

    public int getValueOnQueue(){
        if(indexOffront+1 < this.queue.length) {
            indexOffront++;
            return this.queue[indexOffront];
        }
        System.out.println("Limit of Array exceeded.");
        return 0;
    }
}
