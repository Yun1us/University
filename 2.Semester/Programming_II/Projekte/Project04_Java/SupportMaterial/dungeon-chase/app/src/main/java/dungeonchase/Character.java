package dungeonchase;

public abstract class Character {
    String name;
    boolean alive = true;
    int lastUpdate = 0;

    public Character(String name){
        if (name==null || name.isEmpty()){
            throw new IllegalArgumentException("name must not be null");
        }
        this.name = name;
    }
    //Setter und Getter Methoden
    public String getName(){ 
        return this.name;
    }

    public boolean isAlive(){
        return this.alive;
    }

    public int getLastUpdate(){
        return this.lastUpdate;
    }

    protected void setLastUpdate(int lol){
        this.lastUpdate = lol;
    }

    protected void setAlive(boolean lol){
        this.alive = lol;
    }

    abstract String getImage();

    abstract Direction update(Grid grid, int x, int y, Direction playerMovement); 

    public boolean collisionFrom(Character other){
        this.alive = false;
        return true;
    }
}
