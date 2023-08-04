package com.collections;

public class collectionsFramework {


}


/*
    What is a framework ?
        - A framework is a set of classes and interfaces which provides ready made architecture/ implementation.

    Collection
        - Collection represents the group of object. We may need to store duplicate objects or sometimes we
        need unique objects.
        - Few implementations required ordered objects or few wants unordered.

        Based on requirements we can have implementation of collection and its subinterfaces like LIST,
        SET.

        Why MAP is not part of collection interface hierarchy ?
            - Because MAP holds key and value pair its incompatible with type of collection.
            As collection works only with single element like add() method has only one parameter
            of Element.
        Collection can only be used with Objects and can not be used with primitive data types.

        Java Collections Framework:

                        Collections                     Map                 Iterator
                            |                            |                     |
                            |                            |                     |
                    List    Set    Queue             SortedMap           ListIterator



List interface:
    - We need ordered storage of elements
    - Also need any number of null elements
    - Allows the duplicates

    ArrayList
        - Provides the dynamic arrays in java
        - The size of an Arraylist is increased automatically if the collection grows or shrinks
            if the objects are removed from the collection.
        - not thread safe
        - as compare to arrays, ArrayList are slower in performance.
        - (This class is roughly equivalent to Vector, except that it is unsynchronized)

    Vector
        - Unlike the new collection
        - implementations, Vector is synchronized.  If a thread-safe
        - implementation is not needed, it is recommended to use ArrayList in place of Vector.

        - Stack
            - FILO (First in last out)
            - there is tracker for the elements in stack i.e. Top
            - Push and Pop are used to insertion and deletion of elements from stack respectively.

    LinkedList




-----------------------------------------------------------------------

Set :
    A collection that contains no duplicate elements
    At most one null element can be added


   HashSet
    - Implemented based on the hashtable(actually a HashMap instance)
    - Does not guarantee the iteration order, also no guarantee of order for over the time.
    - Can permit the null element
    - not synchronized

    LinkedHashSet:
        - This is subclass of HashSet
        - Maintains the insertion order
        - Implemented around the doubly linked list concept


    TreeSet:
        - Elements are stored in their natural ordering as well as based on comparator
        which we can pass on to constructor while creating the TreeSet.

        - We need to have atleast comparable implementation or we have to pass the comparator
        class in the constructor while creating the TreeSet.

        Comparable and Comparator:
            - both are interfaces
            - Using comparable we can have only single element comparison so there is no
                scope of having comparison based on any other element.
            - Using comparator we can have comparison based on multiple elements.
            - In case comparator we can implement the separate class to do the implementation
            and we can pass that class in the constructor of TreeSet while creating the object.


------------------------------------------------------------------------
    Queue:
        Queue is used to hold the elements about to be processed in  FIFO( First In First Out) order.
        LILO (Last In Last Out).
       - It has its own way of handling elements apart from collections interface methods.

       Two types method for basic operations

                    Throws the exception        Returns null or false depending on operation
    - Insertion      add(e)                     offer(e);
    - Removal        remove                     poll
    - Examine       element                     peek

    Deque:
        The queue type which supports insertion and deletion of elements from both ends.

        Double ended queue, which also known as deck.
            Following methods to implement the deque


           First Element Head                       Last element Tails
           throws Ex      return special value      throws Ex     return special value

Insertion  addFirst(e)   offerFirst(e)              addLast(e)   offerLast(e)
Removal    removeFirst    pollFirst                 removeLast   pollLast
Examine    getFirst     peekFirst                   getLast     peekLast



    Priority Queue: extends AbstractQueue, AbstractQueue implements Queue interface
        Based on priority heap
        The elements are ordered according to natural ordering,
        We need to implement the comparable for object or we can pass comparator to constructor
        while creation of priority queue.
        It has implementation for offer(), peek() and poll() methods apart from add(), remove.


    LinkedList ,(implements Deque)
        it basically implements List interface but in that case it implements the singly linkedlist.
        It also implements Deque interface, by doing this it implements doubly linkedlist.
        Using Doubly linked list we can add and remove the elements from both the ends of LinkedList.


    ArrayDeque:
        - Resizable-array implements Deque
        - There is no capacity restriction for ArrayDeque.
        - null not supported
        - not thread safe, if external synchronization is not implemented then it doesn't support
          concurrent access by multiple threads.
        - This class is likely to be faster when used as Stack and faster than LinkedList when used as
          Queue.


---------------------------------------------------------------------------------
Map:
    - The map interface  of the java collections framework provides the functionality of map
        data structure.
    - It used the key and value to store into map.
    - Key cannot be duplicate
    - Each key can map to at most one value.

    -three views
        - set of keys
        - set of values
        - collection of key value.

    - Order of the map is defined as the order in which iterators on map's collection views there
     elements.

    - TreeMap guarantees the orders of elements but not the HashMap.


    Classes which implements the Map interface:
        - HashMap
        - LinkedHashMap
        - TreeMap
        - EnumMap
        - HashTable
        - WeakHashMap

    - Some map implementations have restrictions on the key and values they may contains.
    for example some type of maps can contain null key and values whereas not all can provide this implementation.

    Example:
        - We can have null key in HashMap but in TreeMap we can't have the null key.

    - Attempting to insert the ineligible keys or values, will throw the unchecked exception,
        typically NullPointerException or ClassCastException.

    - Attempting to query the presence of ineligible key or value may throw the exception or sometimes may simply
        return the false.


    Unmodifiable Maps:
     Map.of(), Map.OfEntries(), Map.copyOf() -- these are options to create the unmodifiable maps.
     They are unmodifiable, the keys and values can not be added, removed or updated once we create the map using above
     three options.

     - We can not create the unmodifiable maps with null keys and values, attempting to do so will result into NPE
        ( NullPointerException)

HashMap:
    Implementation is based on HashTable.
    It allows the null value and null key.
    If we add the null key and some values against null key then hashmap stores that.
    Next time when we use null key to store some other values then it will override the previous
    value to new value because keys are unique in nature in Hashmap so even null is accepted
    but it will be unique so only one null key is allows in hashmap.

    - This is roughly equivalent to HashTable only difference is that
        - it is unsynchronized and permits null
    - The order can not be guarantee and in particular it does not guarantee that it will remain
    constant over the period of time.

LinkedHashMap:
    - The linkedhashmap is implementation of hashtable and linked list.
    - allows null key and value
    - Only difference between hashmap and linkedhashmap is insertion order will be maintained
    while storing into linkedhashmap.
    - Predictable iteration order.

TreeMap:
    - The implementation is based on NavigableMap.
    - Doesn't allow null key
    - The order will be based on the natural ordering and if we pass comparator at the time of
     creation into constructor.
    - Null for value can be accepted.



ConcurrentModificationException:
    - This exception may be thrown by the method that have detected concurrent modification of objects
      when such modification is not permissible.

    For example:
        it is generally not permissible for one thread to modify the collection while another thread
        is iterating over it.

        Thread A - modifying
        Thread B - Iterating over it..
            if the collection class/type which we are using is not mean for multithreaded environment
            then ConcurrentModificationException may occur.

            fail fast- the iterators which fail when there is concurrent modification happening when
            another thread is iterating through the collection.
            These are called as fail fast because they don't support concurrent modification and fail
            fast & cleanly.

            Examples of fail fast iterator: ArrayList, Vector, HashMap

            Fail Safe iterators:
                - Fail safe iterators allow modification of a collection while iterating over it.
                - These iterators don't throw the ConcurrentModificationException while iterating
                    through it.
                - They use copy of original collection to traverse over the elements of the collection.
                - These iterators require extra memory for cloning of collection
                    Example :
                        ConcurrentHashMap, CopyOnWriteArrayList

Two interfaces - Cloneable and Serializable



Hashing Technique:

    What is hashing in java?
        - Hashing in java  is the technique that enables us to store the data in the form
        of key-value pairs,
        by modifying the original key using the hash function so that
        we can use these modified keys as the index of an array/hashtable and store the
        associated value/data at that index location in the HashTable for each key.

        Algorithms - SHA-1 and SHA-256

        Hash Function:
            While implementing hashing in java it uses a function called as hash function, it is
        the most important part of hashing.
        It transforms supplied keys into another fixed-size value (hash-value).
        The value returned by hash function is called as hash-value, hash-code or simply hashes.


            key --->  Hash Function ----> Hash value


    Hash Table:
        A hash table is an array that holds pointers to data that corresponds to a hashed key.
        Hash table uses hash values as location index to store the associated data in the array.

        Basically, the given keys are converted into hash values using the hash function and those
        values are used as the index of the hash table to store associated value/data.


        Collision:
            Actually, collision occurs when two different inputs to the hash function converts
        to the same hash value.

        for example we pass student roll num - 10 and 20
        and hash function is having hash mechanism based on rollNum%10 = hash value..
        for both 10 and 20 roll num hash value will be 0.. that is called as collision.

    To handle collision:

        Chaining:
            - It uses the linkedlist with hashtable to resolve or minimize the collision.

        Double Hashing :
            - It uses the double hashing function to minimize the collison.

    Hashing Algos:
        - MD5 Algorithm
        - SHA Algorithm





 */
