// import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Objects;
public class PasswordEntry {
    final PasswordComplexity passwordComplexity;
    final String website;
    final String loginName;
    String password;
    static PasswordEntry nextEntry = null;


    public PasswordEntry(String website, String loginName, PasswordComplexity passwordComplexity){
        if(website == null || website.isBlank() ) {
            throw new IllegalArgumentException("website darf nicht null oder blank sein!");
        }
        if(passwordComplexity == null){
            throw new IllegalArgumentException("PasswordComplexity darf nicht null sein!");
        }
        this.website = website;
        this.loginName = loginName;
        this.passwordComplexity = passwordComplexity;
        this.password = passwordComplexity.generatePassword();
    }

    public PasswordEntry(String website, PasswordComplexity passwordComplexity){
        this(website, null, passwordComplexity);
    }
    
    public PasswordEntry(PasswordEntry other){
        if(other == null){
            throw new IllegalArgumentException("other darf nicht null sein!");
        }
        this.website = other.getWebsite();
        this.loginName = other.getLoginName();
        this.passwordComplexity = other.getPasswordComplexity();
        this.password = other.getPassword();
    }
    public String getLoginName(){
        return loginName;
    }

    public String getWebsite(){
        return website;
    }
    public PasswordComplexity getPasswordComplexity(){
        return passwordComplexity;
    }
    
    public String getPassword(){
        return password;
    }
    public PasswordEntry getNextEntry(){
        return nextEntry;
    }
    static public void setNextEntry(PasswordEntry nextEntry){
        PasswordEntry.nextEntry = nextEntry;
    }
    public void regeneratePassword(){
        password = passwordComplexity.generatePassword();
    }

    public String toString(){
        return String.format("%s L:%s P:%s (%s)", website, loginName, password, passwordComplexity);
    }

    @Override 
    public boolean equals(Object other){
        if (this == other){
        return true;}

        else if (other == null){
        return false;}
        
        else if (getClass() != other.getClass()){
        return false;}

        PasswordEntry that = (PasswordEntry) other;       
        
        return Objects.equals(this.website, that.website) &&
        Objects.equals(this.loginName, that.loginName) &&
        Objects.equals(this.password, that.password) &&
        Objects.equals(this.passwordComplexity, that.passwordComplexity);
    }
}