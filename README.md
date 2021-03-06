# Course Notes for [Object Oriented Programming in Java](https://www.coursera.org/learn/object-oriented-java/)

## Whole Course
* Author a class in Java and explain how objects are constructed, how they store data, and how you can define their actions.
* Trace the execution of code using memory-models.
* Define the scope of variables and methods.
* Extend existing libraries to build a medium-sized project.
* Implement user interface features.
* Build and work with a class hierarchy that has multiple levels.
* Explain “is-a” and “has-a” relationships between objects.
* Author code which implements an Interface.
* Explain the difference between compile-time and run-time decisions when working with polymorphism.
* Explain the difference between event-driven programming and imperative programming.
* Use searching and sorting to design algorithms for analyzing data.
* Search for an element in a sorted and unsorted list and explain the differences.
* Explain multiple sorting techniques and performance tradeoffs.

## Week 1 - 2
* Motivate the use of classes and objects in programming
* Write classes in Java
* Create objects and call methods on them
* Describe what member variables, methods and constructors are
* Give examples of overloading methods in Java
* Explain how to overload methods in Java
* Explain why overloading methods is useful
* Describe what the keywords public and private mean and their effect on where variables can be accessed
* Explain what getters and setters are and write them in your classes
* Draw memory models for reasoning about variable values for primitive and object type data
* Update memory models to trace the state of the variables in Java code
* Describe the notion of variable scope
* Explain the basic rules of scope for Java
* Draw memory models that incorporate scope
* Trace code using Java's rules for variable scope

## Week 3
* Explain the value of inheritance as a feature in object oriented programming languages
* Use the keyword extends with confidence
  * Means 'inherit' from
  * what is inherited
    * public instance variables, public methods, private instance variables (remember to use getters and setters)
```java
public class Person
{
	private String name;
	...
}

public class Student extends Person
{
	...
}
```
* Explain the relationship between a superclass and a subclass
  * A subclass inherits from a superclass
  * the subclass's inherted fields and methods are determined by visibility modifiers
  * Less Restrictive: public - can access from any class
  * | protected - can access from: same class, same package, any subclass
  * | package - can access from: same class, same package
  * V private - can only access within class
  * More Restrictive: private - can only access the same class
  * RoT: variables private, methods public 
* Use UML Diagrams to display class hierarchies
  * Stand for 'Unneccessary Managment Lingo'
  * A way of visually architecting a and OO based program
* Explain an “is-a” relationship between classes
  * Subclass is a superclass, not viseversa
  * e.g. Toyota is-a car
* Recognize that all classes inherit from the Object class
  * How does this work? Related to object creation
* Describe how Java object construction occurs from the inside out
  * When you declare any object variable and initialize it (new keyword) it allocates space for the object in memory
  * when object is initialize it initializes the variables in the class from the inside out, ie up through the superclass(es) all the way to Object
* Discuss how the Java Compiler ensures object construction occurs from the inside out
  * Compiler rules
  * The compiler will actually add code during compilation
  * specifially if a class isn't inherited from any other class, java compiler will add extends Object to the class declaration
  * 3 rules of java compiler
    1. No superclass? Javac inserts extends Object
    2. No constructor? Java gives you one default constructor with no arguments 
    3. The first line of a constructer must start with this() - same class constructor or super() - super is a call to the superclass constructor. Otherwise the compiler inserts super()
```java
class Student extends Object {
  private int studentId;
  ...
}
```
* Use same-class and super class constructors in class creation
  - super() or this() must be the first line of the constructor if calling it
  - java will not automatically insert a no argument constructor into a class is any constructor already exists, so if a subclass doesn't have a call the the other constructor in the super class there will be a compile time error (because java will insert super() ie call to the no argument constructor) 
* Create methods which override from a superclass
  - Keep common behaivor in one class, spliet different behavoir into separate classes
* Contrast method overloading and method overriding
  * overloading: class has same method name with different parameters (must return the same value)
  * overriding: SUBclass has same method name with same parameters as the superclass
    - example Object class has toString() method, any class can override toString() because every class inherits from Object
* Explain the purpose of polymorphism
  - 
* Step through decisions made at compile time and runtime
  - think like a compiler, act like a runtime environment
  - complier interprets the code
  - runtime executes the code
  - compile time rules
    + compiler only knows the reference type 
    + can only look in the reference type class for method
    + Outputs a method signature, which is executed at runtime
  - runtime rules
    + follow exact runtime type of object to find method
    + must match compile time method signature to appropriate method in actual object's class
  - super binds at compile time, this binds at runtime
* Use casting of objects to aid the compiler
  - automatic type promotion - widening
    + primative int to double
    + object subclass to superclass
  - instanceof runtime check of is-a relationship s instanceof Student, returns boolean
* Use the keyword "abstract"
  - abstract is placed before a class definition to create an abstract class
```java

```
* Compare “inheritance of implementation” and “inheritance of interface”
* Decide between Abstract Classes and Interfaces

## Week 5
* Motivate the importance of search
  - Searching is obviously important
  - efficient searching is even more important for user expectation and machine efficiency
* Write code to perform a linear search
* Explain the binary search algorithm
* Write code to perform binary search
* Describe the conditions necessary for binary search
* Explain why binary search is better than linear search
* Define sorting
* Explain why sorting data can be useful
* Explain the selection sort algorithm
* Write code to perform selection sort
* Trace code and describe its high-level function
* Describe alternate algorithms for sorting
* Use pre-defined Java method to sort
* Explain the properties of the built-in sort
    - Collections.sort() - can only take in a List of type integer
* Define and use the Comparable interface in Java
    - Must implement the interface Comparable, but need to tell the class on which class property to sort on
    - error after adding the implements Comparable to EarthquakeMarker
    - The type LandQuakeMarker must implement the inherited abstract method Comparable<EarthquakeMarker>.compareTo(EarthquakeMarker)