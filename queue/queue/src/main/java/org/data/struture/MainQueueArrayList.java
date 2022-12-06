package org.data.struture;

public class MainQueueArrayList {
    public static void main(String[] args) {


        QueueArrayslist queueVector = new QueueArrayslist();

        queueVector.setValueOnQueue(1);
        queueVector.setValueOnQueue(2);
        queueVector.setValueOnQueue(3);
        queueVector.setValueOnQueue(4);
        queueVector.printAllElementsOfQueue();
        System.out.println("Remove 2 elements");
        queueVector.getValueOnQueue();
        queueVector.getValueOnQueue();
        queueVector.printAllElementsOfQueue();
        System.out.println("Add 2 elements");
        queueVector.setValueOnQueue(37);
        queueVector.setValueOnQueue(10);
        queueVector.printAllElementsOfQueue();

        System.out.println("Add 10 elements");
        queueVector.setValueOnQueue(55);
        queueVector.setValueOnQueue(67);
        queueVector.setValueOnQueue(90);
        queueVector.setValueOnQueue(100);
        queueVector.printAllElementsOfQueue();
    }
}