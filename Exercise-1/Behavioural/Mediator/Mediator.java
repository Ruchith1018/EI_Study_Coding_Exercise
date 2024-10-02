//Balam Ruchith Balaji
 
import java.util.ArrayList;
import java.util.List;

interface GameMediator {
    void sendMove(String move, Player player);
    void addPlayer(Player player);
}

class GameRoom implements GameMediator {
    private List<Player> players = new ArrayList<>();

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void sendMove(String move, Player player) {
        for (Player p : players) {
            if (p != player) {
                p.receiveMove(move);
            }
        }
    }
}

abstract class Player {
    protected GameMediator mediator;
    protected String name;

    public Player(GameMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMove(String move);
    public abstract void receiveMove(String move);
}

class GamePlayer extends Player {

    public GamePlayer(GameMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMove(String move) {
        System.out.println(this.name + " makes move: " + move);
        mediator.sendMove(move, this);
    }

    @Override
    public void receiveMove(String move) {
        System.out.println(this.name + " receives move: " + move);
    }
}

public class MediatorExample {
    public static void main(String[] args) {
        GameMediator mediator = new GameRoom();

        Player alice = new GamePlayer(mediator, "Alice");
        Player bob = new GamePlayer(mediator, "Bob");
        Player charlie = new GamePlayer(mediator, "Charlie");

        mediator.addPlayer(alice);
        mediator.addPlayer(bob);
        mediator.addPlayer(charlie);

        alice.sendMove("Move 1");
        bob.sendMove("Move 2");
    }
}
