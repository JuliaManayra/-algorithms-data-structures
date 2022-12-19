package org.data.structure;

public class MainStackArrayList {
    public static void main(String[] args) {


        StackList queueVector = new StackList(10);

        queueVector.push(1);
        queueVector.push(2);
        queueVector.push(3);
        queueVector.push(4);
        queueVector.printAllElementsOfStack();
        System.out.println("Remove 2 elements");
        queueVector.pop();
        queueVector.pop();
        queueVector.printAllElementsOfStack();
        System.out.println("Add 2 elements");
        queueVector.push(37);
        queueVector.push(10);
        queueVector.printAllElementsOfStack();

        System.out.println("Add 4 elements");
        queueVector.push(55);
        queueVector.push(67);
        queueVector.push(90);
        queueVector.push(100);
        queueVector.printAllElementsOfStack();
        System.out.println("Remove 2 elements");
        queueVector.pop();
        queueVector.pop();
        queueVector.printAllElementsOfStack();
    }
}