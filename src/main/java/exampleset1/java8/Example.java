package com.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Example {
    public static void main(String args[]) {


        LocalDateTime localDateTime = LocalDateTime.now();

        localDateTime.atZone(ZoneOffset.UTC);
        ZoneId zoneId = ZoneId.of("Europe/Paris");
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread created");
            }
        }).start();


        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }*/
    }
}

/*
Following are features which got introduced with Java 8

1. Lambda expression:
    A lambda expression is  an anonymous function i.e a function with no name and without
    being bound to an identifier.

    Syntax:
    () -> expression
    (parameter) -> expression
    (parameter1, parameter2) -> {  statements;}


    (a, b) -> a + b ;
     above lambda expression takes two parameter and return their sum.

   Rules:
    i. A lambda expression can have zero, one or more parameters.
    ii. The type of parameter can be explicitly declared  or it can be inferred from the context.


2. Functional interfaces:
    - Functional interface is the interface which is having only one abstract method.
    - When we want to restrict any interface with only one abstract method then we should
    use @FunctionalInterface so that if someone tries to add any further abstract methods into
    interface then there will be error on annotation.

    - If we don't use @FunctionalInterface annotation then there is still scope to developer to
    add any further abstract methods to it.

    Example of Functional interfaces from Java -
        - Runnable interface which has run();  -- this is having @FunctionalInterface annotation
        - Comparable with compareTo().  -- no annotation added but still by definition its a
        functional interface.

3. Stream API:

    - Stream is not a data structure instead it takes input from Collections, Arrays and I/O channels.
    - Stream operations are grouped into two parts
        - Intermediate Operation (Lazily executed)
        - Terminal Operation

    - Intermediate operations:
        - Map: method is used to returns a stream consisting the results of applying to elements
        of stream.
       Example:
           List square = numbers
                .stream()
                .map(o -> o * o)   //  intermediate operation
                .collect(Collectors.toList());  // terminal operation

        - filter: The filter method is used to select elements as per the
        Predicate argument.

        List booksStartsWithS =
                books.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());

         - sorted: this method is used to sort the stream

            strings.stream()
                    .sorted()
                    .collect(Collectors.toList());


       - Terminal Operations:
          - collect: method is used to return the result of the intermediate operations performed
          on stream

           - forEach: method is used to iterate through every elements of stream.

            nums.stream()
                .map(o -> o * o)   //  intermediate operation
                .forEach(integer -> System.out.println(integer));
          - count():

          - allMatch()
          - anyMatch()


4. Method Reference (::)
      className :: memberFunction

5. Optional Class:
    Optional is the container which may or may not contain the null value.
    we can use Optional to avoid occurrence of NPE.(NullPointerException)

6. LocalDate and LocalDateTime API
    Issues with existing Date and Time API
        - Thread Safety - Date and time api are not thread safe. in multithreaded environment
        it was difficult to debug the concurrency.
        - There was requirement of immutable object as well as the thread safety, that's when
        Date API introduced in java 8 provides the both.

        - Simple and easily implemented features and methods got introduced in java 8

        - Time-zone implementation has been eased out with java 8 date api.


7. Default method and static method in interfaces

8. forEach():


9. Memory change as perGen got removed instead of this we got metaSpace



*/
