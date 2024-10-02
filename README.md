# Design Patterns in Java - Exercise 1

## Overview
This repository contains various implementations of common design patterns in Java. Each implementation demonstrates a specific design pattern with corresponding classes and a main execution class to illustrate their functionality. 

### Design Patterns Implemented

1. **Iterator Pattern** - Book Collection
   - **Description**: Implements an iterable collection of books, allowing for sequential access to the collection without exposing its underlying representation.
   - **Key Classes**:
     - `Book`: Represents a book with a title.
     - `BookCollection`: Stores multiple `Book` objects and implements the `Iterable` interface to provide an iterator.
     - `Main`: Demonstrates the usage of the iterator to traverse and print the book titles.

2. **Mediator Pattern** - Chat Application
   - **Description**: Implements a chat application where users communicate through a mediator (chat room), allowing for loose coupling between users.
   - **Key Classes**:
     - `ChatMediator`: Interface for the mediator that handles message passing.
     - `ChatRoom`: Concrete mediator that manages user communication.
     - `User`: Abstract class representing a user in the chat.
     - `ChatUser`: Concrete implementation of a user that can send and receive messages.
     - `Main`: Demonstrates user communication through the chat room.

3. **Builder Pattern** - Computer Configuration
   - **Description**: Implements a builder for constructing complex `Computer` objects step by step.
   - **Key Classes**:
     - `Computer`: Represents a computer with CPU, RAM, and storage.
     - `ComputerBuilder`: Builder class for creating `Computer` instances.
     - `Main`: Demonstrates the construction of a `Computer` object using the builder.

4. **Singleton Pattern** - Logger Implementation
   - **Description**: Implements a singleton logger that ensures only one instance of the logger exists throughout the application.
   - **Key Classes**:
     - `Logger`: Singleton class that provides logging functionality.
     - `Main`: Demonstrates logging messages using the singleton logger instance.

5. **Bridge Pattern** - Remote Control System
   - **Description**: Implements a remote control system that can operate various devices without being tightly coupled to them.
   - **Key Classes**:
     - `Device`: Interface for devices that can be controlled.
     - `TV` and `Radio`: Concrete implementations of devices.
     - `RemoteControl`: Abstraction for remote control operations.
     - `BasicRemote`: Concrete implementation of remote control.
     - `Main`: Demonstrates device control using different remotes.

6. **Composite Pattern** - Organization Structure
   - **Description**: Implements an organization structure using the composite pattern, allowing for tree-like hierarchies of employees.
   - **Key Classes**:
     - `Worker`: Represents an employee who can have subordinates.
     - `Main`: Demonstrates the creation of an organization hierarchy and prints out the structure.

# [Exercise-2](https://github.com/Ruchith1018/EI_Study_Coding_Exercise/tree/main/Exercise-2) - Astronaut Daily Schedule Organizer

## Overview
The **Astronaut Daily Schedule Organizer** is a console application designed to manage daily tasks effectively. This application allows users to add, remove, and view tasks with specific descriptions, times, and priorities. It also includes features for marking tasks as completed and filtering tasks based on priority.

## Features
- **Add Tasks**: Users can add tasks with descriptions, start and end times, and priorities (Low, Medium, High).
- **Remove Tasks**: Users can remove tasks by providing the task description.
- **Mark Tasks as Completed**: Users can mark tasks as completed to keep track of their progress.
- **View Tasks**: Users can view all tasks or filter them by priority.
- **Conflict Detection**: The application checks for conflicts when adding tasks with overlapping times.

