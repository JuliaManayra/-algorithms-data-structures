package org.data.structure;

public class StackVector {

    private int top;
    private int indexOfLast;
    private int[] stack;


    public StackVector(int size){
        this.stack = new int[size];
        this.top = 0;
        this.indexOfLast =  0;
    }

    public void printAllElementsOfStack(){
        for (int i = 0; i < top; i++) {
            System.out.println(this.stack[i]);
        }
    }

    public void push(int value){
        if(top+1 < this.stack.length) {
            this.stack[top] = value;
            top++;

        }else {
            System.out.println("Limit of Array exceeded.");
        }
    }

    public int pop(){
        if(top < this.stack.length) {
            int value =  this.stack[top];
            top--;
            return value;
        }
        System.out.println("Limit of Array exceeded.");
        return 0;
    }

}
