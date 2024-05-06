/**
 * @author Inoussa Adouba 
 * Die Klasse PasswordStore dient zur Verwaltung von mehreren PasswordEntrys
 * PasswordStore besitzt zwei Attribute:
 * int size - aktuelle Anzahl der Eintraege
 * PasswordEntry firstEntry - Referenz auf den ersten Eintrag
 */
public class PasswordStore {
    private int size; // Anzahl der Einträge
    private PasswordEntry firstEntry; // Erster Eintrag 

    /**
     * Konstruiert einen leeren PasswordStore ohne Einträge.
     */
    public PasswordStore(){
        this.size = 0;
        this.firstEntry = null;
    }

    /**
     * Gibt die Anzahl der Einträge zurück.
     *
     * @return die Größe des Speichers
     */
    public int getSize(){
        return size;
    }

    /**
     * Gibt den ersten Passworteintrag im Speicher zurück.
     *
     * @return den ersten Passworteintrag oder null, wenn der Speicher leer ist
     */
    public PasswordEntry getFirstEntry() {
        return firstEntry;
    }

    /**
     * Setzt den ersten Eintrag des Passwortspeichers.
     *
     * @param firstEntry der Passworteintrag, der als erster gesetzt wird
     */
    public void setFirstEntry(PasswordEntry firstEntry){
        this.firstEntry = firstEntry;
    }

    /**
     * Überprüft, ob ein bestimmter Eintrag im Speicher vorhanden ist.
     *
     * @param entry der zu überprüfende Passworteintrag
     * @return true, wenn der Eintrag vorhanden ist, sonst false
     * @throws IllegalArgumentException wenn der bereitgestellte Eintrag null ist
     */
    public boolean contains(PasswordEntry entry){
        if (entry == null){
            throw new IllegalArgumentException("Eintrag darf nicht null sein!");
        }
        if (this.firstEntry == null) {
            return false;
        }

        PasswordEntry current = firstEntry; //Beginn mit ersten Eintrag 
        while(current != null){ //Durchläuft die Liste bis keine Einträge vorhanden sind
            if (current.equals(entry)){ //Prüft auf Gleichheit R 
                return true; // true wenn der Eintrag gefunden wurde
            }
            current = current.getNextEntry(); // Iteriert weiter zum nächsten Eintrag
        }
        return false; // Eintrag wurde nicht gefunden
    }

    /**
     * Fügt einen neuen Eintrag in die Liste ein.
     *
     * @param entry der hinzuzufügende Passworteintrag
     * @return true, wenn der Eintrag erfolgreich hinzugefügt wurde, false, wenn es ein Duplikat war
     * @throws IllegalArgumentException wenn der bereitgestellte Eintrag null ist
     */
    public boolean add(PasswordEntry entry){
        if(entry == null){
            throw new IllegalArgumentException("Eintrag darf nicht null sein!");
        }
        if(this.contains(entry)){
            return false;
        }

        entry.setNextEntry(firstEntry); //Aktueller firstEntry wird zu NextEntry des neuen Eintrags
        setFirstEntry(entry); //Eintrag wird zum FirstEntry
        size++; //size wird um 1 erhöht 
        return true;
    }

    /**
     * Gibt alle Passworteinträge aus.
     */
    public void printPasswordStore(){
        PasswordEntry current = firstEntry; //Start beim ersten Eintrag
        for(int i = 0; i < size; i++){
            System.out.println(i + ". " + current.toString()); 
            current = current.getNextEntry(); // Iteriere zum nächsten Eintrag.
        }
    }

    /**
     * Druckt alle Passworteinträge für eine bestimmte Webseite aus.
     *
     * @param website die Webseite, nach der die Einträge gefiltert werden sollen
     * @throws IllegalArgumentException wenn der Parameter website null ist
     */
    public void printPasswordStore(String website){
        if (website == null){
            throw new IllegalArgumentException("Website-Parameter darf nicht null sein");
        }
        PasswordEntry current = firstEntry; //Beginn beim ersten Eintrag
        int index = 0;
        while(current != null){
            if (current.getWebsite().equals(website)){ //Hier wird auf Gleichheit der Website-Adressen geprüft
                System.out.println(index + ". " + current.toString());
            }
            current = current.getNextEntry(); //iteration 
            index++; //index wird um 1 erhöht
        }
    }

    /**
     * Ruft einen Passworteintrag an einem bestimmten Index im Speicher ab.
     *
     * @param index der Index des abzurufenden Eintrags
     * @return der Passworteintrag am angegebenen Index
     * @throws IllegalArgumentException wenn der Index außerhalb der Grenzen liegt
     */
    public PasswordEntry get(int index){ //gibt den Eintrag übergebenen Index in der verketteten Liste zurück
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Index außerhalb der Grenzen");
        }
        PasswordEntry current = firstEntry;
        for(int currentIndex = 0; currentIndex < index; currentIndex++){
            current = current.getNextEntry();
        }
        return current;
    }

}
