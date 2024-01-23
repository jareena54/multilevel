# Multilevel Inheritance Example in Java

## Overview

This Java project serves as an example of multilevel inheritance, a concept in object-oriented programming (OOP). Multilevel inheritance occurs when a class is derived from a class, and then another class is derived from the second class.

## Classes

### 1. `BaseClass`

- The `BaseClass` is the top-level class in the hierarchy.
- It contains common properties and methods that are shared among all derived classes.

### 2. `IntermediateClass`

- The `IntermediateClass` is derived from `BaseClass`.
- It inherits properties and methods from `BaseClass` and may introduce additional ones.

### 3. `DerivedClass`

- The `DerivedClass` is derived from `IntermediateClass`.
- It inherits properties and methods from both `BaseClass` and `IntermediateClass`.

## Example Usage

```java
// Instantiate objects
BaseClass baseObj = new BaseClass();
IntermediateClass intermediateObj = new IntermediateClass();
DerivedClass derivedObj = new DerivedClass();

// Access properties and methods
baseObj.baseMethod();
intermediateObj.baseMethod();
intermediateObj.intermediateMethod();
derivedObj.baseMethod();
derivedObj.intermediateMethod();
derivedObj.derivedMethod();
