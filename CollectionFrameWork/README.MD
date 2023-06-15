# What is Collections in Java

- Collections is a framework that provides an architecture to store and manipulate the group of objects.

##### Collections Example

- Integers
- Floats
- Strings

## Collection Framework in java

java provides `collection frameWork` in form of the `class and the interfaces` to store and `manipulate` the group of objects.

## Collection Interface

it is the root interface of the collection framework hierarchy.

![Collection Interface](https://d3n0h9tb65y8q.cloudfront.net/public_assets/assets/000/002/676/original/Java_Collections.png?1643450544)

### 1. List Interface

It is a collection of an ordered and duplicate elements. It is an interface that extends the collection interface.

- ArrayList
- LinkedList
- Vector
- Stack

`vector and stack is called legacy class` these are the classes that were present before the collection framework was introduced.

### 2.Queue Interface

This interface `Work on the principle of FIFO` (First In First Out). It is an interface that extends the collection interface.

#### 2.1 Deque Interface

It is a double ended queue that supports addition or removal of elements from either end of the data structure. It is an interface that extends the queue interface.

#### 2.1.1 ArrayDeque

It is a resizable array that supports addition or removal of elements from either end of the data structure. It is an implementation class of the deque interface.

#### 2.2 Priority Queue

It is an unbounded queue that supports the `comparable interface`. It is an interface that extends the queue interface.

### 3. Set Interface

It is a collection that cannot contain duplicate elements. It models the mathematical set abstraction. It is an interface that extends the collection interface.Set is unordered.

- HashSet (hashcode)
- LinkedHashSet

#### 3.1 SortedSet Interface

It is a set that maintains the elements in the ascending order. It is an interface that extends the set interface.
elements are sorted in the ascending order.

- TreeSet (comparable)

### 4.Map Interface

It is an object that maps keys to values. A map cannot contain duplicate keys. It is an interface that extends the collection interface.

- HashMap
- LinkedHashMap
- TreeMap

  #### 4.1 SortedMap Interface

  It is a map that maintains the elements in the ascending order. It is an interface that extends the map interface.

## Understanding the Collection Framework

All `the classes and interfaces` for the collection framework are available in `java.util package`.

## Methods of Collection Interface

```java

//all the methods are generic by default and can be used with any type of collection.

//HERE E IS THE TYPE OF COLLECTION
// o is the object

add(E o)
addAll(Collection<E>o)
remove(Object o) // it will return true if the object is removed
removeAll(Collection<E>o) 
retainAll(Collection<E>o) // delete all the elements except the elements present in the collection
clear() // delete all the elements
isEmpty() // return true if the collection is empty
contains(Object o) // return true if the collection contains the object
containsAll(Collection<E>o) // return true if the collection contains all the elements of the collection
size() // return the number of elements in the collection
toArray() // convert the collection into an array
iterator() // return the iterator object that can be used to iterate the elements of the collection



```

## List Interface

`List Interface` is the child interface of `Collection interface`.

If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for `List Interface`.


`All Methods of Collection` + `List Interface Methods`

```java

add (int index, Object o)
addAll(int index, Collection<E> c)
remove(int index)
get(int index)
set(int index, Object o) // it will not shift the elements but will change the value of the element at the given index
subList(int fromIndex, int toIndex)
indexOf(Object o) // return the index of the first occurrence of the object
lastIndexOf(Object o) // return the index of the last occurrence of the object
listIterator() //bidirectional
listIterator(int index)
```

## Set Interface 

`Set Interface` is the child interface of `Collection interface`. 

It doesn't allow duplicates. If we want to represent a group of individual objects as a single entity where duplicates are not allowed and insertion order is not preserved then we should go for `Set Interface`.

set has no new methods other than Collection interface methods.

## Queue Interface

`Queue Interface` is the child interface of `Collection interface`.

`FIFO` (First In First Out) is the default nature of the queue.

If we want to represent a group of individual objects prior to processing then we should go for `Queue Interface`.

```java

add(E c)
.poll() // it will remove the first object in queue if the queue is empty it will return null
.remove() // it throws an exception if the queue is empty NoSuchElementException
.peek() // It will return the first object in queue if the queue is empty it will return null
.element() // first object in queue // it throws an exception if the queue is empty NoSuchElementException
.offer(E c) // it returns false if the queue is full
```

## TreeMap

`TreeMap` is the implementation class of `Map Interface`.

If we want to represent a group of objects as key-value pairs then we should go for `Map Interface`.

It will store the objects based on some sorting order of keys.

## HashMap

`HashMap` is the implementation class of `Map Interface`.

It will store the objects based on `hashcode` of keys.

## Linked HashMap

The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it.

1. order Insertion
2. order Access

Eg: if limit is 3 and we add 4th element then the 1st element will be removed in case of order insertion.

Eg: if limit is 3 and we access 4th element then the 1st element will be removed in case of order access.
