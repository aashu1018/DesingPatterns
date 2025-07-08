# Design Patterns in Java

Design patterns are **reusable solutions** to common problems encountered in software design. In Java, they represent established **best practices** that help developers create applications that are more **flexible**, **maintainable**, and **scalable**.

Design patterns are typically categorized into **three main types**, based on their purpose:

---

### 🔨 Creational Patterns

Creational patterns deal with **object creation mechanisms**, aiming to create objects in a way that's suitable to the situation while abstracting the instantiation logic.

* **Singleton**: Ensures a class has only one instance and provides a global access point to it.
* **Factory Method**: Defines an interface for creating an object, but allows subclasses to decide which class to instantiate.
* **Abstract Factory**: Offers an interface to create families of related or dependent objects without specifying their concrete classes.
* **Builder**: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
* **Prototype**: Creates new objects by copying an existing object (cloning).

---

### 🧱 Structural Patterns

Structural patterns focus on how classes and objects are **composed to form larger structures**, promoting reusability and flexibility.

* **Adapter**: Converts the interface of a class into another interface expected by clients, allowing incompatible classes to work together.
* **Bridge**: Decouples an abstraction from its implementation so both can vary independently.
* **Composite**: Composes objects into tree structures to represent part-whole hierarchies, letting clients treat individual objects and compositions uniformly.
* **Decorator**: Dynamically adds new behavior to objects without altering their structure, offering a flexible alternative to subclassing.
* **Proxy**: Acts as a placeholder or surrogate for another object to control access to it.

---

### 🔁 Behavioral Patterns

Behavioral patterns are concerned with **object interaction and communication**, defining how responsibilities are distributed.

* **Observer**: Establishes a one-to-many dependency so that when one object changes state, its dependents are automatically notified and updated.
* **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
* **Command**: Encapsulates a request as an object, allowing parameterization, queuing, and logging of requests.
* **Iterator**: Provides a standard way to traverse through a collection without exposing its underlying implementation.
* **Chain of Responsibility**: Allows a request to be passed along a chain of handlers until it is processed, decoupling sender and receiver.

---

These design patterns help in building robust Java applications by encouraging **modular**, **extensible**, and **loosely-coupled** code structures.
