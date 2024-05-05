import com.google.common.collect.ImmutableList;

public class PasswordStore {
    private int size;
    private PasswordEntry firstEntry;


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
    }

    public boolean contains(PasswordEntry entry){
        PasswordEntry current = firstEntry;
        if (entry == null){
            throw new IllegalArgumentException("entry darf nicht null sein!");
        }
        while(current != null){
            if (current.equals(entry)){
                return true;
            }
            current = current.getNextEntry();
        }
        return false;        
    }
    public boolean add(PasswordEntry entry){
        if(entry == null){
            throw new IllegalArgumentException("entry darf nicht null sein!");
        }
        if(contains(entry)){
            return false;
        }
        else{
            entry.setNextEntry(firstEntry);
            setFirstEntry(entry); 
            size++;
            return true;
        }
    }
}

