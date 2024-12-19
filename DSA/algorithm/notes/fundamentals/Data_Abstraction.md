# Fundamentals - Data Abstraction

## OOPs

Defining and using data types, with data-type values held in objects, is widely referred to as
object-oriented programming.

## Data Type

A data-type is a set of values and a set of operations on those values.

Data abstraction is the process of defining and using data types.

An abstract data type (ADT) is a data type whose representation is hidden from the client.

Objects are characterized by 3 essential properties:
- State - The state of an object is a value from its data type.
- Identity - The identity of an object distinguishes one object from another.
- Behavior - The behavior of an object is the effect of data-type operations.

A constructor has no return type because it always returns a reference to an object of its data type.
Each time that a client uses new(), the system
- Allocates memory space for the object
- Invokes the constructor to initialize its value
- Returns a reference to the object

An instance method might change the data-type value or just examine the data-type value.

## Primitive Types

Java has 8 primitive types.

- byte
- short
- int
- long
- float
- double
- char
- boolean

## Reference Type

In JAVA, reference types refer to object rather than primitive types. For ex : 
- Class types : Instances of classes eg. String, ArrayList and custom classes
- Array types : Array of objects or primitives(eg. int[], String[])
- Interface types : Intstances of classes that implement interfaces(eg. List, Runnable)

Key characteristics
- Memory storage : Reference types store references to objects, not the actual data
- Heap Allocation : Objects of reference types are allocated on the heap memory
- Default value : The default value of a reference type variable is null
- Methods and Fields : Methods and fields that can be accessed using dot(.) operator.

## Aliasing

If x and y are variables of a primitive type, then the assignment x = y copies the value of y to x.
For reference types, the reference is copied not the value. (known as aliasing)