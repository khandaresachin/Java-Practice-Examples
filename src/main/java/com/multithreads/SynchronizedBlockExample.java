package com.multithreads;

public class SynchronizedBlockExample extends Thread{

    private String msg;
    Sender sender;
    public SynchronizedBlockExample(String m, Sender s){
            msg = m;
            sender = s;
    }

    public void run(){
        //only one thread can send a message at a time
        synchronized (sender){
            sender.send(msg);
        }
    }
}
