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

## Information processing

Date : Day, month and year
Transaction : Customer, date and amount

- If we were to use public instance variables (allowed in Java) the data type would, by definition, not be abstract.
- An abstract data type is a data type whose representation is hidden from the client.
- The purpose of an API is to separate clients from implementation, to enable modular programming.

- Subclassing refers to the creation of a class (child class) that inherits from another class (parent class). 
- Subtyping refers to the concept where a type (interface or class) is considered to be a subtype of another if it 
  adheres to its contract. 

## Safe pointers

In Java, there is only one way to create a reference (new) and  only one way to change a reference (with an assignment 
statement).In programming-language jargon, Java references are known as safe pointers, because Java  can guarantee that 
each reference points to an object of the specified type (and it can determine which objects are not in use, for garbage
collection).

## Issue with Subtyping

Subtyping makes modular programming more difficult for two reasons. 

First, any change in the superclass affects all subclasses. The subclass cannot be developed independently of the 
superclass; indeed, it is completely dependent on the superclass. This problem is known as the fragile base class 
problem. 

Second, the subclass code, having access to instance variables, can subvert the intention of the superclass code. For
example, the designer of a class like Counter for a voting system may take great care to make it so that Counter can 
only increment the tally by one (remember Al Gore’s problem). But a subclass, with full access to the instance variable,
can change it to any value whatever.

## Defensive copying

Defensive copying is a programming practice used to prevent unintended or malicious modification of an object’s internal
state by making a copy of mutable objects before sharing them. This technique ensures that objects or data passed between
different parts of a program remain protected from unwanted changes, preserving encapsulation and immutability.

```java
//constructor defensive copy

public class ImmutableStudent {
    private final List<String> subjects;

    public ImmutableStudent(List<String> subjects) {
        // Defensive copy to prevent external modification of the original list
        this.subjects = new ArrayList<>(subjects);
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects); // Return a copy to avoid exposing the internal list
    }
}

//constructor defensive copy
List<String> mySubjects = new ArrayList<>();
mySubjects.add("Math");

ImmutableStudent student = new ImmutableStudent(mySubjects);
mySubjects.add("Science"); // Does NOT affect the student's subjects

//Getter defensive copy
public List<String> getSubjects() {
  return new ArrayList<>(subjects); // Defensive copy
}
```