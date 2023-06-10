## STREAMS

### 1. What is a stream?

A stream is a flow of sequence of data elements either from the source to the destination or vice versa. It is a sequence of data elements made available over time. A stream can be thought of as items on a conveyor belt being processed one at a time rather than in large batches.

## What is Buffer?

A buffer is a temporary storage area that stores the data when it is being transferred from one place to another. It is a region of memory used to temporarily hold data while it is being transferred from one place to another.

### What is the need of Buffer in Streams?

To brings the compatibility between the faster producer and slower consumer. It is used to make the faster producer and slower consumer compatible with each other.

Broadly java provides 2 types of streams:

1. Byte Streams
   - InputStream
   - OutputStream
2. Character
   - Reader
   - Writer

#### 1. InputStream

The InputStream is used to `read data from a source`. In other words, we can say that it is used for `reading data from the input device`. It is `an abstract class`. It is the superclass of all classes `representing an input stream of bytes`.

## Methods of InputStream

| Method                               | Description                                                                                                                                                                     |
| ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| int read()                           | It is used to read one byte of data from the input stream.if there is nothing to read then it will return -1                                                                    |
| int read(byte[] b)                   | It is used to read the bytes of data from the input stream and stores it into the buffer array b.                                                                               |
| int read(byte[] b, int off, int len) | It is used to read the bytes of data from the input stream and stores it into the buffer array b. It reads maximum len bytes from the input stream starting from an offset off. |
| int available()                      | It is used to return the estimated number of bytes that can be read from the input stream.                                                                                      |
| long skip(long x)                    | It is used to skip over and discards x bytes of data from the input stream.                                                                                                     |
| void mark(int limit)                 | It is used to mark the current position in the input stream. limit will used to specific that how long the mark is supported                                                    |
| void reset()                         | It is used to reset the input stream to the last marked position.                                                                                                               |
| boolean markSupported()              | It is used to test the input stream support for the mark and reset method.                                                                                                      |
| void close()                         | It is used to close the input stream.                                                                                                                                           |

### 2. OutputStream

The OutputStream is used to `write data to a destination`. In other words, we can say that it is used for `writing data to the output device`. It is `an abstract class`. It is the superclass of all classes `representing an output stream of bytes`.

#### Methods of OutputStream

| Method                                 | Description                                                                                                                             |
| -------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --- |
| void write(int b)                      | It is used to write the specified byte to the output stream.                                                                            |
| void write(byte[] b)                   | It is used to write the specified byte array to the output stream.                                                                      |
| void write(byte[] b, int off, int len) | It is used to write the specified byte array from an offset off and length len to the output stream.                                    |
| void flush()                           | It is used to flushes the output stream and forces any buffered output bytes to be written out.It will work only is BufferOutput Stream |     |
| void close()                           | It is used to close the output stream.                                                                                                  |

## FileOutputStream

`The FileOuputStream` is used to `write data to a file`. It is used for `writing byte-oriented as well as text-oriented data` to a file. It is a subclass of OutputStream class.

#### Constructors of FileOutputStream class

| Constructor                   | Description                                                                                              |
| ----------------------------- | -------------------------------------------------------------------------------------------------------- |
| FileOutputStream(String name) | It is used to create a file output stream to write to the file represented by the specified File object. |

## Serialization

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

`In java it is achieve using the ObjectOutputStream and ObjectInputStream classes.`

#### ObjectOutputStream class

`The ObjectOutputStream class` is used to `write primitive data types and Java objects to an OutputStream`. Only objects that support the java.io.Serializable interface can be written to streams. The ObjectOutputStream class contains many write methods for writing various data types.

#### Constructors of ObjectOutputStream class

| Constructor                          | Description                                                                           |
| ------------------------------------ | ------------------------------------------------------------------------------------- |
| ObjectOutputStream(OutputStream out) | It is used to create an ObjectOutputStream that writes to the specified OutputStream. |

#### Methods of ObjectOutputStream class

| Method                       | Description                                              |
| ---------------------------- | -------------------------------------------------------- |
| void writeObject(Object obj) | It is used to write an object to the ObjectOutputStream. |
| void flush()                 | It is used to flush the stream.                          |
| void close()                 | It is used to close the stream.                          |

#### ObjectInputStream class

`The ObjectInputStream class` is used to `read Java objects from an InputStream`. Only objects that support the java.io.Serializable interface can be read from streams. The class contains many read methods for reading various data types like byte, short, int, double, float, long etc.

While reading you have to `typecaste the returned object`.

#### Constructors of ObjectInputStream class

| Constructor                       | Description                                                                          |
| --------------------------------- | ------------------------------------------------------------------------------------ |
| ObjectInputStream(InputStream in) | It is used to create an ObjectInputStream that reads from the specified InputStream. |

#### Methods of ObjectInputStream class

| Method              | Description                                              |
| ------------------- | -------------------------------------------------------- |
| Object readObject() | It is used to read an object from the ObjectInputStream. |
| void close()        | It is used to close the stream.                          |


`You must implement the Serializable interface to make your class serializable. If you do not implement this interface, you get the NotSerializableException.`


There is no need to implement any methods of Serializable interface. It is a marker interface. `There is no abstract method in the Serializable interface.`

`Non-paramterized constructor must be present in the class whose object is to be serialized.`

`If you have a paramterized constructor in your class, you must have a no-arg constructor as well.` Otherwise you can use ObjectOutputStrem but not ObjectOutputStream.

`Static or transiant data members are not serialized because they are not the part of the object state.`