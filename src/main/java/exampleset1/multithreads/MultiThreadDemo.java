package com.multithreads;

public class MultiThreadDemo extends Thread{

    public void run(){
        try{
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        }catch (Exception e){
            System.out.println("Exception caught");
        }
    }

    public void display(){

        System.out.println("Thread "+ Thread.currentThread().getId() + " is running");
    }
}
