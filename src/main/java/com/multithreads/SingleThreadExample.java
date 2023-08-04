package com.multithreads;

public class SingleThreadExample {

    public static void main(String args[]){
         /*System.out.println("Hello");
         System.out.println("World");
         System.out.println("Single");
         System.out.println("Thread");
         System.out.println("Execution");*/

        for(int i=1; i<=10; i++){
            SingleThreadDemo object = new SingleThreadDemo();
            object.display();
        }
    }
}



/*
    MultiThreading:

        A Thread is an extremely lightweight process, or the smallest component of process, that enables
        software to work more effectively by doing numerous tasks concurrently/simultaneously.

        Some of its uses include the fact that server-side programs employ it since a server should
        be multi-threaded so that many clients can be served at once.

        Multithreading in java  is a process of executing multiple threads simultaneously. The main
        reason for incorporating threads into an application is to improve its performance.

        Games and animations can be also made using multithreading.


        Multithreading  is a feature in java that concurrently executes two or more parts of program
        for utilizing the CPU at its maximum.
        The part of each program is called Thread which is lightweight process.


        Multithreading ways of implementation in java
            - Extend the Thread class
            - Implement the Runnable interface


   Thread class Vs Runnable interface:
    - If we extend  the Thread class, our class cannot extend any other class because java doesn't
    support multiple inheritance. But if we implement Runnable interface, our class can still
    extend other class as well as any number of interfaces can be implemented.

    - We can achieve basic functionality of a thread by extending Thread class because it provides some
    inbuild methods like yield(), interrupt(), etc.. that are not available in Runnable interface.

    - Thread class also implements Runnable interface.

    - Using runnable will give us an object that can be shared amongst multiple threads.

    Life cycle of Thread:
        There are five different states a Thread has to go through in its life cycle.
        This life cycle is controlled by JVM(Java Virtual Machine).
        Following are the states of Thread:

        1. New
        2. Runnable
        3. Running
        4. Non-Runnable(Blocked)
        5. Terminated

    New:
        In this state, a new thread begins its life cycle.
        This is called a born thread. The thread is in the new state if we create an instance of
        Thread class but before the invocation of start() method.

    Runnable:
        A thread becomes runnable after a nealy born thread is started
        in this state, a thread would be executing its task.

    Running:
        When the thread scheduler selects the thread then, that thread would be in a running state.

    Non- Runnable(Blocked):
        The thread is still alive in this state, but currently its not eligible to run.

    Terminated:
        A thread is terminated due to following reasons:
            - either run() method exists normally i.e. the thread's code has executed the program.
            - Or due to some unusual erros like segmentation fault or unhandled exception.







 */