package de.hawlandshut.java1.oop.game;

// snippet: class
public class SlimeBlob 
  extends Enemy implements Cloneable{
// snippet: /class

  // snippet: SlimeColor
  public static enum SlimeColor{ RED, GREEN, BLUE };
  // snippet: /SlimeColor

  // snippet: attributes
  private int size;
  private SlimeColor color;
  // snippet: /attributes

  public SlimeBlob(String name, int x, int y, int health, int attackPower, int size, SlimeColor color){
    super(name,x,y,health,attackPower);
    this.size = size;
    this.color = color;
  }

  @Override public String toString() {
    return String.format("%s, size=%d, color=%s", 
        super.toString(), size, color.name());
  }

  @Override public void update(){
    // do nothing
  }

  // snippet: clone
  @Override public SlimeBlob clone() {
    try {
      return (SlimeBlob) super.clone();
    } catch (CloneNotSupportedException e){
      throw new AssertionError("...");
    }
  }
  // snippet: /clone

  // snippet: divide
  public SlimeBlob[] divide(){
    Blobling child1 = 
      new Blobling(this, getName()+"ling 1", 
          getX(), getY(), getHealth(),  
          getAttackPower(), size/2, color);
  
    Blobling child2 = 
      new Blobling(this, getName()+"ling 2", 
          getX(), getY(), getHealth(),  
          getAttackPower(), size/2, color);
  
    return new SlimeBlob[] { child1, child2 };
  }
  // snippet: /divide
  
  // snippet: innerDivide
  public SlimeBlob[] innerDivide(){
    InnerBlobling child1 = 
      new InnerBlobling(getName()+"ling 1", getX(), getY(), 
          getHealth(), getAttackPower(), size/2, color);
    InnerBlobling child2 = 
      new InnerBlobling(getName()+"ling 2", getX(), getY(), 
          getHealth(), getAttackPower(), size/2, color);

    return new SlimeBlob[] { child1, child2 };
  }
  // snippet: /innerDivide

  // snippet: blobling
  private static class Blobling extends SlimeBlob{
    private final SlimeBlob parent;
  
    private Blobling(SlimeBlob parent, String name, 
        int x, int y, int health, int attackPower, 
        int size, SlimeColor color){
      super(name,x,y,health,attackPower,size,color);
      this.parent = parent;
    }
  
    public SlimeBlob getParent() { return parent; }
  }
  // snippet: /blobling
  
  // snippet: innerBlobling
  public class InnerBlobling extends SlimeBlob{
  
    public InnerBlobling(String name, 
        int x, int y, int health, int attackPower, 
        int size, SlimeColor color){
      super(name,x,y,health,attackPower,size,color);
    }
  
    public int getParentSize() {
      return SlimeBlob.this.size;
    }
  }
  // snippet: /innerBlobling

  // snippet: localDivide
  public SlimeBlob[] localDivide(){

    // Klassendefinition
    class LocalBlobling extends SlimeBlob{

      private LocalBlobling(String name, 
          int x, int y, int health, int attackPower, 
          int size, SlimeColor color){
        super(name,x,y,health,attackPower,size,color);
      }

      public SlimeBlob getParent() { return SlimeBlob.this; }
    }

    // Verwendung
    LocalBlobling child1 = 
      new LocalBlobling(getName()+"ling 1", getAttackPower(), 
          getX(), getY(), getHealth(), size/2, color);
    LocalBlobling child2 = 
      new LocalBlobling(getName()+"ling 2", getAttackPower(), 
          getX(), getY(), getHealth(), size/2, color);

    return new SlimeBlob[] { child1, child2 };
  }
  // snippet: /localDivide

  // snippet: anonymousDivide
  public SlimeBlob[] anonymousDivide(){

    final int outerParentSize = size;

    // Kinder erstellen
    SlimeBlob child1 = new SlimeBlob(getName(), getX(), getY(), 
        getHealth(), getAttackPower(), size/2, color){

      public SlimeBlob getParent(){
        return SlimeBlob.this;
      }
    };

    SlimeBlob child2 = new SlimeBlob(getName(), getX(), getY(), 
        getHealth(), getAttackPower(), size/2, color){
      private int parentSize;

      { // Initializer
        this.parentSize = outerParentSize;
      }

      public int getParentSize(){
        return parentSize;
      }
    };
    return new SlimeBlob[] { child1, child2 };
  }
  // snippet: /anonymousDivide



}
