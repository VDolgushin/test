package ru.nsu.dolgushin.lab0802.task3.model;

public class Child extends Parent{
    private int n;
    public Child(int N){
        super("Child_" +Integer.toString((int)(Math.random()*200-100)));
        n = N;
    }
    public void print(){
        for(int i = 0; i < n; i++) {
            super.print();
        }
    }
}
