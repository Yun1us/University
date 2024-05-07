import java.util.Objects;

/**
 * @author Inoussa Adouba
 * Diese Klasse repräsentiert einen Passworteintrag mit Website, Login-Namen und Passwortkomplexität.
 */
public class PasswordEntry {
    private final PasswordComplexity passwordComplexity; // Die Komplexität des Passworts.
    private final String website; // Die Webseite, für die das Passwort erstellt wurde.
    private final String loginName; // Der Loginname für die Webseite.
    private String password; // Das generierte Passwort.
    private PasswordEntry nextEntry = null; // Verkettung von Passworteinträgen.

    /**
     * Konstruktor für einen vollständigen Passworteintrag.
     * @param website Die Webseite.
     * @param loginName Der Login-Name.
     * @param passwordComplexity Die gewählte Passwortkomplexität.
     */
    public PasswordEntry(String website, String loginName, PasswordComplexity passwordComplexity) { //Konstruktor der die drei Attribute website,loginName und passwordComplexity initialisiert
        if (website == null || website.isBlank()) { //check ob wesite null oder blank ist
            throw new IllegalArgumentException("Website darf nicht null oder leer sein!");
        }
        if (passwordComplexity == null) { // check ob passwordComplexity null ist
            throw new IllegalArgumentException("PasswordComplexity darf nicht null sein!");
        }
        this.website = website;
        this.loginName = loginName;
        this.passwordComplexity = passwordComplexity;
        this.password = passwordComplexity.generatePassword();
    }

    /**
     * Vereinfachter Konstruktor für einen Passworteintrag ohne Login-Namen.
     * @param website Die Webseite.
     * @param passwordComplexity Die Passwortkomplexität.
     */
    public PasswordEntry(String website, PasswordComplexity passwordComplexity) {
        this(website, null, passwordComplexity);
    }

    /**
     * Kopierkonstruktor.
     * @param other Ein anderer Passworteintrag, der kopiert wird.
     */
    public PasswordEntry(PasswordEntry other) {
        if (other == null) {
            throw new IllegalArgumentException("Other darf nicht null sein!");
        }
        this.website = other.getWebsite();
        this.loginName = other.getLoginName();
        this.passwordComplexity = other.getPasswordComplexity();
        this.password = other.getPassword();
        this.nextEntry = other.nextEntry;
    }

    // Getter-Methoden für die Klasse
    public String getLoginName() { return loginName; }
    public String getWebsite() { return website; }
    public PasswordComplexity getPasswordComplexity() { return passwordComplexity; }
    public String getPassword() { return password; }
    public PasswordEntry getNextEntry() { return nextEntry; }
    public void setNextEntry(PasswordEntry nextEntry) { this.nextEntry = nextEntry; }

    /**
     * Regeneriert das Passwort für diesen Eintrag basierend auf der aktuellen Passwortkomplexität.
     */
    public void regeneratePassword() {
        this.password = passwordComplexity.generatePassword();
    }

    
    public String toString() {
        return String.format("%s L:%s P:%s (%s)", website, loginName, password, passwordComplexity); //Formatiert den String in gewünschter Weise. 
    }

    @Override
    public boolean equals(Object other) {  // Equals checkt ob ein anderes Objekt gleich dem spezifischen PasswordEntry-Objekt ist. 
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        PasswordEntry that = (PasswordEntry) other; 
        return Objects.equals(this.website, that.website) &&
               Objects.equals(this.loginName, that.loginName) &&
               passwordComplexity == that.passwordComplexity;
    }
}
