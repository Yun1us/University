package dungeonchase;

public class Wall extends Character {

    public Wall() {
        super("Wall");
    }

    @Override
    String getImage() {
        return "wall.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return Direction.NONE;
    }

    @Override
    public boolean collisionFrom(Character hero){
        return false;
    }
}
