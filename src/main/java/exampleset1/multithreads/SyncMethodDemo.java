package com.multithreads;

public class SyncMethodDemo {

    public static void main(String args[]){

        final SenderSyncMethod obj = new SenderSyncMethod();

        Thread t1 = new Thread(){
            public void run(){
                obj.send("Hello");
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                obj.send("World");
            }
        };

        t1.start();
        t2.start();

        /*try {
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println("Interrupted !");
        }*/
    }
}
