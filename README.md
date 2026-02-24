# Tasca S1 06

## Description

This project was created for academic purposes as part of the IT ACADEMY Java & Spring specialization. The focus of this task is to understand and implement **Generics** in Java, exploring how they provide type safety, code reusability, and flexibility by allowing classes and methods to operate on various types.


## Techonologies

- Java 17+
- Gradle


## Project Structure

```
TascaS1.06/
├── src/
└──  main/
     └── java/
         ├── first_level/
         │    ├── NoGenericMethods.java
         │    ├── GenericMethods.java
         │    ├── Person.java
         │    └── Main.java
         └── second_level/
              ├── SecondLevelGenericMethods.java
              └── Main.java
```

## Installation

1. Clone the repository: `git clone https://github.com/isalvama/tascaS1.06.git`
2. Navigate to the project directory: `cd TascaS1.06`
3. Build the project using Gradle: `./gradlew build`
4. Run the application: `./gradlew run`


## Concepts covered

- **Type Parameters**: Implementation of classes with single and multiple type placeholders (`<T, U, V>`).
- **Code Reusability**: Contrasting non-generic classes (fixed types) with generic ones.
- **Type Safety**: Ensuring that objects are handled correctly at compile-time regardless of their class.
- **Varargs (Variable Arguments)**: Using `T...` to allow a method to accept a variable number of arguments of a generic type.
- **Annotations**: Usage of `@SafeVarargs` to suppress warnings when using varargs with generic types.


## First Level

### Ex 1 & 2: Generic vs Non-Generic Methods

#### NoGenericMethods class
This class illustrates the limitation of non-generic programming. It has three fixed `int` attributes. This design lacks flexibility, as the class is strictly tied to the `int` data type and any change in requirements would require creating new classes or using `Object` (which loses type safety).

#### GenericMethods class
In contrast, this class uses three independent type parameters `<T, U, V>`. This allows the class to store and print any combination of objects (Strings, Integers, or custom objects like `Person`) in its attributes. It demonstrates how generics allow a single class structure to adapt to different data types during instantiation.

#### Person class
A simple POJO (Plain Old Java Object) used to demonstrate how custom classes can be used as type arguments in generic structures.

#### Main class
The entry point that instantiates several versions of `GenericMethods`. It showcases that the order and the type of arguments passed to the constructor are flexible, allowing combinations such as `<String, Person, Integer>` or even nesting a generic object inside another.


## Second Level

### Ex 1 & 2: Generics and Varargs

#### SecondLevelGenericMethods class
This class introduces more advanced generic concepts:
- **Mixed Parameters**: It combines a fixed type placeholder with multiple generic types.
- **Varargs Implementation**: The `printAll` method uses the syntax `T... objects`. This allows the user to pass an arbitrary number of arguments of type `T` to the method.
- **@SafeVarargs**: Since combining generics and varargs can lead to potential heap pollution warnings, this annotation is used to indicate that the implementation safely handles the array created by the varargs mechanism.

#### Main class
Demonstrates the practical application of the second-level logic. It instantiates the generic class and calls the `printAll` method passing several `Person` objects as arguments, illustrating how a single method call can process a dynamic list of objects efficiently.