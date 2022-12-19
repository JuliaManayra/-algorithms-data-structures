package org.data.structure;

import java.util.ArrayList;

public class StackList {

    private int top;
    private int indexOfLast;
    private ArrayList<Integer> stack;


    public StackList(int size){
        this.stack = new ArrayList<>(size);
        this.top = 0;
        this.indexOfLast =  0;
    }

    public void printAllElementsOfStack(){
        for (int i = top-1; i >=0 ; i--) {
            System.out.println(this.stack.get(i));
        }
    }

    public void push(int value){
        this.stack.add(top, value);
        top=this.stack.size();
    }

    public int pop(){
        if(this.stack.size()>0) {
            int value =  this.stack.get(this.stack.size()-1);
            this.stack.remove(this.stack.size()-1);
            top=this.stack.size();
            return value;
        }
        System.out.println("Limit of Array exceeded.");
        return 0;
    }

}
