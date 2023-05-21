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

It is used to hold the elements `about to be processed` and `provides various operations` like the `insertion, removal etc`. It is an interface that extends the collection interface.

#### 2.1 Deque Interface

It is a double ended queue that supports addition or removal of elements from either end of the data structure. It is an interface that extends the queue interface.

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


add(E o)
addAll(Collection<E>o)
remove(Object o)
removeAll(Collection<E>o)
retainAll(Collection<E>o)
clear()
contains(Object o)
containsAll(Collection<E>o)
isEmpty()
size()
toArray()
iterator()


```

## List Interface

`List Interface` is the child interface of `Collection interface`.

If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order must be preserved then we should go for `List Interface`.

```java

add (int index, Object o)
addAll(int index, Collection<E> c)
remove(int index)
get(int index)
set(int index, Object o)
subList(int fromIndex, int toIndex)
indexOf(Object o)
lastIndexOf(Object o)
listIterator() //bidirectional
listIterator(int index)
```


## Queue Interface

`Queue Interface` is the child interface of `Collection interface`.

If we want to represent a group of individual objects prior to processing then we should go for `Queue Interface`.

```java 

add(E c)
.poll()
.remove() // it throws an exception if the queue is empty NoSuchElementException 
.peek() // first object in queue
.element() // first object in queue // it throws an exception if the queue is empty NoSuchElementException
.offer(E c) // it returns false if the queue is full
```

