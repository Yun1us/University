package dungeonchase;

public class TreasureChest extends Character{

    public TreasureChest(String name) {
        super("Treasure Chest");
    }

    @Override
    String getImage() {
        return "treasure-chest.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return Direction.NONE;
    }

    public boolean collisionFrom(Character other){
        if (other instanceof Player){
            other.alive = false;
            return true;
        }
        return false;
    }
}
