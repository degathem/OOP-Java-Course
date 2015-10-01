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
* Describe how Java object construction occurs from the inside out
* Discuss how the Java Compiler ensures object construction occurs from the inside out
* Use same-class and super class constructors in class creation
* Create methods which override from a superclass
* Contrast method overloading and method overriding
* Explain the purpose of polymorphism
* Step through decisions made at compile time and runtime
* Use casting of objects to aid the compiler
* Use the keyword "abstract"
* Compare “inheritance of implementation” and “inheritance of interface”
* Decide between Abstract Classes and Interfaces