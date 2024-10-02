# Composite Pattern Example: Organization Structure

## Overview
This example demonstrates the Composite Design Pattern by creating a hierarchical organization structure. The Composite Pattern allows individual objects and compositions of objects to be treated uniformly. In this case, we have an organization where the `Worker` class represents employees, and some employees have subordinates, forming a tree-like structure.

## Classes

### 1. Worker (Component Class)
Represents a worker in the organization, which can either be a manager (with subordinates) or a regular employee.

- **Attributes**:
  - `fullName`: The name of the worker.
  - `role`: The role of the worker in the organization.
  - `teamMembers`: A list of workers who report to this worker.

- **Methods**:
  - `add(Worker worker)`: Adds a worker as a subordinate to this worker.
  - `remove(Worker worker)`: Removes a subordinate from this worker.
  - `getTeamMembers()`: Returns the list of subordinates.
  - `toString()`: Displays the worker's name and role.

### 2. OrganizationStructure (Main Class)
Demonstrates the creation of the organization hierarchy and how the Composite Pattern can be used to treat a single worker and a group of workers uniformly.

- **Actions**:
  - Creates an organizational structure with a CEO, department heads, and team members.
  - Prints out the hierarchy by traversing through the tree-like structure of workers.

## Usage
- The `Worker` class allows you to create individual employees and assign subordinates to form a hierarchical structure.
- By using the `add()` and `remove()` methods, you can manage subordinates, making this class flexible for representing various types of organizations.
- Each worker can have its own subordinates, and the Composite Pattern allows easy traversal of the entire hierarchy.

## How It Works
- **Composite Pattern**: The pattern is used to treat both individual objects and compositions of objects (i.e., subordinates) in a uniform way. Each `Worker` object can represent either an individual employee or a composite of employees, depending on whether it has subordinates.
- By using the `add()`, `remove()`, and `getTeamMembers()` methods, you can build complex tree structures, such as organizational charts.

---