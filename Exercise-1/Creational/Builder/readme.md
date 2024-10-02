# Builder Pattern Example: Laptop Configuration

## Overview
This implementation demonstrates the Builder Pattern by creating a laptop configuration system. The Builder Pattern helps in constructing complex objects step by step. In this case, the pattern is applied to a `Laptop` object that stores attributes such as processor, memory, and disk storage.

## Classes

### 1. Laptop
Represents a laptop configuration.

- **Attributes**:
  - `processor`: The processor type of the laptop.
  - `memory`: The memory (RAM) size of the laptop.
  - `disk`: The disk storage of the laptop.
  
- **Methods**:
  - `toString()`: Provides a string representation of the laptop configuration.

### 2. LaptopBuilder
A builder class used to construct a `Laptop` object.

- **Attributes**:
  - `processor`: The processor type.
  - `memory`: The memory (RAM) size.
  - `disk`: The disk storage size.
  
- **Methods**:
  - `setProcessor(String processor)`: Sets the processor type and returns the builder object.
  - `setMemory(String memory)`: Sets the memory size and returns the builder object.
  - `setDisk(String disk)`: Sets the disk storage and returns the builder object.
  - `build()`: Builds and returns the `Laptop` object.

### 3. Main (BuilderExample Class)
Demonstrates the use of the Builder Pattern.

- **Actions**:
  - Creates a `LaptopBuilder`, sets the laptop configuration, and builds the `Laptop` object.

## Usage
- The `LaptopBuilder` class is used to set the individual attributes of the `Laptop`.
- The `build()` method is called to create a complete `Laptop` object with the configured specifications.
- The constructed `Laptop` object is printed using the `toString()` method.

## How It Works
- **Builder Pattern**: This pattern simplifies the creation of complex objects by breaking down the construction into discrete steps (setting processor, memory, and disk). Each step returns the builder object, enabling method chaining. Finally, the `build()` method assembles and returns the final product (`Laptop`).

---