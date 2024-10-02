# Bridge Pattern Example: Appliance Control

## Overview
This implementation demonstrates the Bridge Pattern by creating a control system for appliances. The Bridge Pattern decouples an abstraction from its implementation so that both can vary independently. In this case, a `Controller` class controls different `Appliance` types, making it easier to extend the functionality of either the appliance or the controller without affecting the other.

## Classes

### 1. Appliance (Interface)
Represents a generic appliance that can be controlled.

- **Methods**:
  - `powerOn()`: Turns the appliance on.
  - `powerOff()`: Turns the appliance off.

### 2. Concrete Appliance Implementations
These classes implement the `Appliance` interface:
- **WashingMachine**: Represents a washing machine.
- **AirConditioner**: Represents an air conditioner.
  
Both classes implement the `powerOn()` and `powerOff()` methods to display the power state.

### 3. Controller (Abstract Class)
Represents an abstract remote control for the appliances.

- **Attributes**:
  - `appliance`: Holds a reference to an `Appliance` object that the controller will manage.
  
- **Methods**:
  - `switchPower()`: An abstract method to toggle the appliance's power state.

### 4. ButtonController (Concrete Controller)
A concrete implementation of the `Controller`, which switches the appliance's power state.

- **Attributes**:
  - `isPoweredOn`: Keeps track of whether the appliance is on or off.
  
- **Methods**:
  - `switchPower()`: Toggles the power state of the appliance.

### 5. Main (BridgeExample Class)
Demonstrates the use of the Bridge Pattern.

- **Actions**:
  - Creates appliances (WashingMachine and AirConditioner).
  - Uses the `ButtonController` to control the power state of the appliances.

## Usage
- The `Controller` class is used to decouple the implementation details of controlling the appliances from the `Appliance` interface. This makes it possible to extend either the appliances or the controllers independently.
- You can easily switch between controlling different appliances using the same `Controller` class.

## How It Works
- **Bridge Pattern**: The pattern decouples the abstraction (`Controller`) from the concrete implementation (`Appliance`), allowing both to vary independently.
- By using composition, the `Controller` class holds a reference to an `Appliance`, enabling the same `Controller` to be used for different appliances.
