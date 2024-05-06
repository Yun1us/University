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
        if (entry == null){
            throw new IllegalArgumentException("entry darf nicht null sein!");
        }
        if (this.firstEntry == null) {
            return false;
        }

        PasswordEntry current = firstEntry;
        //while(current != null){
        //if (current.equals(entry)){
        //        return true;
        //    }
        //    current = current.getNextEntry();
        //}
        while (true) {
            if (current.equals(entry)) return true;
            if (current.getNextEntry() == null) return false;
            current = current.getNextEntry(); 
        }
    }
    public boolean add(PasswordEntry entry){
        if(entry == null){
            throw new IllegalArgumentException("entry darf nicht null sein!");
        }
        if(this.contains(entry)){
            return false;
        }

        if(this.firstEntry == null){
            this.firstEntry = entry;
            this.size++;
            return true;
        }

        entry.setNextEntry(firstEntry);
        this.setFirstEntry(entry); 
        this.size++;
        return true;
        
    }
}

