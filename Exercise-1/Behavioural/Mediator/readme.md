# Mediator Pattern Example: Game Room

## Overview
This implementation demonstrates the Mediator Pattern using a game room system. The Mediator Pattern helps decouple the players by providing a mediator (the `GameRoom`) that facilitates communication (moves) between them. In this example, players send and receive moves via the `GameMediator` without needing direct references to other players.

## Classes

### 1. Player
Represents an individual player in the game.

- **Attributes**:
  - `name`: A string that holds the name of the player.
  - `mediator`: A reference to the `GameMediator` that coordinates the interaction between players.

- **Methods**:
  - `sendMove(String move)`: Sends a move via the mediator.
  - `receiveMove(String move)`: Receives a move from another player via the mediator.

### 2. GameRoom (Concrete Mediator)
A collection class that mediates between multiple players.

- **Attributes**:
  - `players`: A list that holds `Player` objects.
  
- **Methods**:
  - `addPlayer(Player player)`: Adds a `Player` to the game.
  - `sendMove(String move, Player player)`: Sends the player's move to other players.

### 3. Main (MediatorExample Class)
Demonstrates the use of the Mediator Pattern.

- **Actions**:
  - Creates a `GameRoom`, adds players to it, and has the players send and receive moves.

## Usage
- `Player` objects are created with their names and are added to the `GameRoom`.
- Players make moves by calling the `sendMove` method, which notifies other players through the `GameMediator`.

## How It Works
- **Mediator Pattern**: This pattern centralizes communication between players, with `GameRoom` acting as a mediator that forwards moves to all players except the one who initiated the move.
- Players interact indirectly, reducing dependencies between individual players.
