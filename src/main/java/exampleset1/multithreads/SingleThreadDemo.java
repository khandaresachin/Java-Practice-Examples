package com.multithreads;

public class SingleThreadDemo {

    public void display(){
        System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
    }
}
