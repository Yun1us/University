package dungeonchase;

public enum Direction { //enum Konstanten
    NONE(0, 0),
    NORTH(0, 1),
    NORTH_EAST(1, 1),
    EAST(1, 0),
    SOUTH_EAST(1, -1),
    SOUTH(0, -1),
    SOUTH_WEST(-1, -1),
    WEST(-1, 0),
    NORTH_WEST(-1, 1);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() { //getter für dx 
        return dx;
    }

    public int getDy() { //getter für dy
        return dy;
    }

    public static Direction fromD(int dx, int dy) { //Gibt für die Parameter die entsprechende Richtung zurück 
        for (Direction dir : values()) {
            if (dir.dx == dx && dir.dy == dy) {
                return dir;
            }
        }
        throw new IllegalArgumentException("Ungültige Parameter: ()" +dx + "," + dy + ")"); 
    }

    public Direction opposite(){ //Gibt die entgegengesetzen Parameter zurück 
        int dxx = dx;
        dxx = -dx;
        int dyy = dy;
        dyy = -dy;
        return fromD(dxx, dyy);
    }

    public static Direction random4(){ //gibt einen zufälligen Wert aus den Himmelsrichtungen zurück 
        double random = Math.random()*4;
        if (random>0 && random<=1){
            return NORTH;
        }
        else if(random>1 && random<=2){
            return EAST;
        }
        else if(random>2 && random<=3){
            return SOUTH;
        }
        else if(random>3 && random<=4){
            return WEST;
        }
        return NONE;
    }
}
