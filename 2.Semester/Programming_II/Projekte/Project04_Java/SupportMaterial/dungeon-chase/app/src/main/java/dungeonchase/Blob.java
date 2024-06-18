package dungeonchase;

public class Blob extends Character implements Replicable{

    double prob;

    public Blob(String name, double x) {
        super(name);
        if (x>=1 || x<=0){
            throw new IllegalArgumentException("probability must be higher then, or 0 and lower then, or 1");
        }
        this.prob = x;
    }

    @Override
    public Direction replicationDirection() { //gibt die Direction dse Blobs an 
        if (Math.random() < prob) {
            return Direction.random4();
        }
        else{
            return Direction.NONE;
        }
    }

    @Override
    public Character generateReplication() { //Liefert Kopie des Blobs
        return new Blob("Blob", prob);
    }

    @Override
    String getImage() {
        return "blob.png";
    }

    @Override
    Direction update(Grid grid, int x, int y, Direction playerMovement) {
        return Direction.random4();
    }

}
