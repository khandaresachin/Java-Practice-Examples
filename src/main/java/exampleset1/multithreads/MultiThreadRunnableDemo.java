package com.multithreads;

public class MultiThreadRunnableDemo implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
        }catch (Exception e){
            System.out.println("Exception caught");
        }
    }
}
