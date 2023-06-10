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

| Method | Description                                                                                                                                                                     |
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

| Method | Description |
|-|-|
| void write(int b) | It is used to write the specified byte to the output stream. |
| void write(byte[] b) | It is used to write the specified byte array to the output stream. |
| void write(byte[] b, int off, int len) | It is used to write the specified byte array from an offset off and length len to the output stream. |
| void flush() | It is used to flushes the output stream and forces any buffered output bytes to be written out.It will work only is BufferOutput Stream| |
| void close() | It is used to close the output stream. 


## FileOutputStream 

`The FileOuputStream` is used to `write data to a file`. It is used for `writing byte-oriented as well as text-oriented data` to a file. It is a subclass of OutputStream class.


#### Constructors of FileOutputStream class

| Constructor | Description |
|-|-|
| FileOutputStream(String name) | It is used to create a file output stream to write to the file represented by the specified File object. |


## Serialization


Let's Take an example 


```java
class Student
{
   int id;
   String name;
   String dept;
}

class MyWrite
{
   public static void main(String args[])
   {
      FileOutputStream fos = new FileOutputStream("student.txt");
      PrintS
   }
}

```

