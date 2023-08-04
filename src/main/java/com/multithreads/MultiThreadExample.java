package com.multithreads;

public class MultiThreadExample {
    public static void main(String args[]){
       /* Thread t1= new Thread("T1");
        Thread t2= new Thread("T2");
        Thread t3= new Thread("T3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread names are as follows");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());*/

        for(int i=1; i<=10; i++){
            MultiThreadDemo object = new MultiThreadDemo();
            object.start(); // this method is multi-threaded and hence we will be able to see
                            // everytime we thread is assigned for the object
            object.display(); // this method is not multi-threaded even though it is part of
                            // same class and also we will be able to see everytime only
                            // single thread is assigned to all the objects
        }
        try {
            for(int i=1; i<10; i++){
                Thread object = new Thread(new MultiThreadRunnableDemo());
                //object.run();// with this we won't get multithreading
                Thread.sleep(-1000);
                object.start(); // with this method JVM starts the Thread and calls run method for that
                // thread

            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
