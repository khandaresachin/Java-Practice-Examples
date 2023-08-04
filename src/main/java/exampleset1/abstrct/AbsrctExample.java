package com.abstrct;

public abstract class AbsrctExample {
    String name ;
    public AbsrctExample(String name){
        this.name = name;
    }
    public void print(){
    }
    public abstract String display();
}


/*
 Abstraction:

    In java, abstraction is achieved by interfaces and abstract classes.


    Abstract classes and Abstract methods:
        - abstract class is declared with abstract keyword
        - abstract method is also declared with abstract keyword and which doesn't have a body.
        - Subclasses of abstract class must implement the abstract method or else it must be declared
        as  abstract class
        - A class which has one or more abstract methods should be declared as abstract using
        keyword
        - We can not instantiate the abstract class with new keyword. (No objects can be created).



On local --- class Mqttbroker  extends MqttClient
         -connect      --- connecting to local mqtt just needs url and port
         -publish(topic)   -- Different payload class
         -subscribe         -- different payload subscribed or mapped
         -getConnection     --- this returns the mqttclient of local mqtt

On cloud --- class AWSIOTcore extends MqttClient (mqtt )
         -connect      --- To connect we need pem file, private key and root-CA.crt, endpoint
         -publish(topic)  -- Different payload class
         -subscribe       -- different payload subscribed or mapped
         -getConnection    -- this returns the mqttclient of aws iot core

    concrete class --- public abstract class MqttClient
         -connect
         -publish
         -subscribe
         -getConnection

Abstraction Advantages:
    - Reduces the complexity
    - Increases reusability
    - Code looks cleaner and maintainable

-----------------------------------------------------------------
Interface

 - Interfaces are the blueprint can be used to implement a class.
 - interface does not contain any concrete method (method with logic or code implementation)
 - interface cannot be instantiated
 - We can achieve multiple inheritance using interfaces.
 - One interface can extend any number of interfaces using extends keyword.


Parameter           interfaces              Abstract class
multiple
inheritance             yes                     No
Structure           Abstract methods           Abstract and concrete methods

When to use         Future enhancement          To avoid the independence
                    only abstract contract      Combination of abstract and non abstract requirement
Access modifiers    No access modifiers         Can have access modifiers
                    everything has to be
                    public

Data fields         cannot contain data fields    Can have data fields

constructor         no constructors               Abstract class can have constructors

Explicit
abstract keyword        No required               we need to explicitly add abstract keyword for
                                                    both class and method


 */
