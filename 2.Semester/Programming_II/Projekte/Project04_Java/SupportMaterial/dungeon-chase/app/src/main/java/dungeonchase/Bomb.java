package dungeonchase;

public class Bomb extends Character {

    public Bomb(String name) {
        super("Bomb");
    }

    @Override
    String getImage() {
        return "bomb.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return Direction.NONE;
    }

    public boolean collisionFrom(Character other){
        other.alive = false;
        return true;
    }
}
