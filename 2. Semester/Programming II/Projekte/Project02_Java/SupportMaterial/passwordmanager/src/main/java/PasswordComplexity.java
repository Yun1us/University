import java.util.Random;
public enum PasswordComplexity {
    PIN("0", 4),
    SIMPLE("aA", 5),
    MEDIUM("aA0", 8),
    COMPLEX("aA0!", 10),
    SUPER_COMPLEX("aA0!", 16);

    private final String chars;
    private final int length;

PasswordComplexity(String chars, int length){
    this.chars = chars;
    this.length = length;
}

public String getChars(){
    return chars;
}
public int getLength(){
    return length;
}

public String generatePassword(){
    Random random = new Random();
    String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!?+-;,.:";
    StringBuilder password = new StringBuilder();
    for(int i = 0; i < length; i++){
        switch(this){
            case PIN:
            password.append(allowedChars.charAt(random.nextInt(10)));
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
    return password.toString();
    }
}

