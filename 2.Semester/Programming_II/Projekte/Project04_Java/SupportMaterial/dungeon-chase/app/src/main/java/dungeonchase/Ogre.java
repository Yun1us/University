package dungeonchase;

public class Ogre extends Character {

    public Ogre(String name) {
        super(name);
    }

    @Override
    String getImage() {
        return "ogre.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        int distX = grid.getPlayerX() - x;
        int distY = grid.getPlayerY() - y;
        /* 
        if (distanceToPlayerY > 0 && (distanceToPlayerY > distanceToPlayerX && distanceToPlayerY > -distanceToPlayerX)){
            return Direction.NORTH;            
        } 
        else if (distanceToPlayerY < 0 && (distanceToPlayerY < distanceToPlayerX && distanceToPlayerY < -distanceToPlayerX)){
            return Direction.SOUTH;
        }
        else if (distanceToPlayerX > 0 && (distanceToPlayerX > -distanceToPlayerY && distanceToPlayerX > distanceToPlayerY)){
            return Direction.EAST;
        }
        else if (distanceToPlayerX < 0 && (distanceToPlayerX < -distanceToPlayerY && distanceToPlayerX < distanceToPlayerY)){
            return Direction.EAST;
        }
        return Direction.NONE;
        */
        if (Math.abs(distX) >= Math.abs(distY)) {
            if (distX > 0) {
                return Direction.EAST;
            }
            else return Direction.WEST;
        }
        else  {
            if (distY > 0) {
                return Direction.NORTH;
            }
            else return Direction.SOUTH;
        }
    }

}
