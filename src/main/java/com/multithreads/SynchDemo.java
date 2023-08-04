package com.multithreads;

public class SynchDemo {

    public static void main(String args[]){

        Sender send = new Sender();

        SynchronizedBlockExample t1 = new SynchronizedBlockExample("Hello", send);
        SynchronizedBlockExample t2 = new SynchronizedBlockExample("There", send);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println("Interrupted !");
        }

    }
}
