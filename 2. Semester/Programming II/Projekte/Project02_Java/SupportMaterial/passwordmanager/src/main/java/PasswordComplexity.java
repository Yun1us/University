import java.util.Random;
public enum PasswordComplexity {    //enum PasswordComplexity
    PIN("0", 4),    // festlegung der Konstanten und deren chars sowie auch lengths
    SIMPLE("aA", 5),
    MEDIUM("aA0", 8),
    COMPLEX("aA0!", 10),
    SUPER_COMPLEX("aA0!", 16);

    private final String chars; //initialisierung von chars und length
    private final int length;

PasswordComplexity(String chars, int length){ //Konstruktor der PasswordComplexity enum
    this.chars = chars;
    this.length = length;
}

public String getChars(){ //getter methode chars die chars returned
    return chars;
}
public int getLength(){ //getter methode geLength die die länge returned
    return length;
}

public String generatePassword(){ //generate password generiert passwörter 
    Random random = new Random(); //initialisierung von Random
    String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!?+-;,.:"; //allowedChars variable die alle erlaubten charakter beinhaltet
    StringBuilder password = new StringBuilder(); //effektivere weise an den String password dinge zu appenden 
    for(int i = 0; i < length; i++){ //schleife 
        switch(this){ //switcher der zwischen die Complexities switcht  
            case PIN:
            password.append(allowedChars.charAt(random.nextInt(10))); //gibt eine random zahl von 0-9 wieder die auf den index von allowedChars basiert.
            break;
            case SIMPLE:
            password.append(allowedChars.charAt(random.nextInt(10,allowedChars.length()-8)));
            break;
            case MEDIUM:
            password.append(allowedChars.charAt(random.nextInt(allowedChars.length()-8)));
            break;
            case COMPLEX: case SUPER_COMPLEX:
            password.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
            break;
        }
    }
    return password.toString(); //password wird in ein immutable String verwandelt
    }
}

