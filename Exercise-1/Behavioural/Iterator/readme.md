# Iterator Pattern Example: Movie Collection

## Overview
This implementation demonstrates the Iterator Pattern using a movie collection system. The Iterator Pattern allows for sequential access to elements of a collection without exposing its underlying representation. In this case, the pattern is applied to a `MovieCollection` that stores `Movie` objects.

## Classes

### 1. Movie
Represents an individual movie.

- **Attributes**:
  - `name`: A string that holds the name of the movie.
  
- **Methods**:
  - `getName()`: Returns the name of the movie.

### 2. MovieCollection
A collection class that stores multiple `Movie` objects.

- **Attributes**:
  - `movies`: A list that holds `Movie` objects.
  
- **Methods**:
  - `addMovie(Movie movie)`: Adds a `Movie` to the collection.
  - `iterator()`: Returns an iterator to traverse the collection, allowing for sequential access to the `Movie` objects.

### 3. Main (IteratorExample Class)
Demonstrates the use of the Iterator Pattern.

- **Actions**:
  - Creates a `MovieCollection`, adds movies to it, and iterates over the collection using the for-each loop.

## Usage
- `Movie` objects are created with their names.
- A `MovieCollection` is used to store these movies.
- By implementing the `Iterable` interface in `MovieCollection`, the iterator can be used to loop through the movies in the collection.

## How It Works
- **Iterator Pattern**: The pattern provides a way to access the elements in the collection one by one.
- **Iterable Interface**: The `MovieCollection` implements `Iterable<Movie>`, allowing the collection to be used in a for-each loop or manually using an iterator.