package dungeonchase;

public class Player extends Character {
    public Player(String name) {
        super(name);
    }

    @Override
    public String getImage() {
        return "player.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return playerMovement;
    }
}
