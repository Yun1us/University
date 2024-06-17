package dungeonchase;

public class Blackknight extends Character {

    public Blackknight(String name) {
        super(name);
    }

    @Override
    String getImage() {
        return "black-knight.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return playerMovement.opposite();
    }
    
}
