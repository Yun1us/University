public class PasswordStore {
    private static int size = 0;
    private static PasswordEntry firstEntry = null;


    public PasswordStore(){
        this.size = 0;
        this.firstEntry = null;

    }

    public int getSize(){
        return size;
    }
    public PasswordEntry getFirstEntry() {
        return firstEntry;
    }

    public void setFirstEntry(PasswordEntry firstEntry){
        this.firstEntry = firstEntry;
        if (firstEntry == null){
            size= 0;    
        }
        else
        size = 1;
    }

    public boolean contains(PasswordEntry entry){
        if (entry == null){
            throw new IllegalArgumentException("entry darf nicht null sein!");
        }

        PasswordEntry current = this.firstEntry;
        while(current != null){
            if (current.equals(entry)){
                return true;
            }
            current = current.getNextEntry();
        }
        return false;        
    }
}

