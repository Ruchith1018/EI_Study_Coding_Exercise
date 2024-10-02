# Singleton Pattern Example: Event Logger

## Overview
This implementation demonstrates the Singleton Pattern by creating an `EventLogger` class. The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance. In this case, the pattern is applied to an event logger that handles event messages.

## Classes

### 1. EventLogger
Represents a logger that logs event messages to the console.

- **Attributes**:
  - `loggerInstance`: A static reference to the single instance of the `EventLogger` class.

- **Methods**:
  - `getLogger()`: Returns the single instance of the logger. If it doesn't exist, it creates one.
  - `record(String event)`: Logs an event to the console.

### 2. Main (SingletonDemo Class)
Demonstrates the use of the Singleton Pattern.

- **Actions**:
  - Retrieves the `EventLogger` instance multiple times and logs events using it.

## Usage
- The `EventLogger` class provides a `getLogger()` method to ensure only one instance is ever created.
- The `record()` method is used to log event messages to the console.
- All instances of `EventLogger` retrieved using `getLogger()` refer to the same object, ensuring that the logger is a singleton.

## How It Works
- **Singleton Pattern**: The pattern ensures that only one instance of the `EventLogger` is created. The `EventLogger` constructor is private, preventing direct instantiation. The static `getLogger()` method checks whether the instance exists and creates it if necessary, providing a global point of access to the logger.
