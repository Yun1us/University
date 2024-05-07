import java.util.Random;

/**
 * @author Inoussa Adouba
 * Dieses Enum definiert verschiedene Passwortkomplexitätsstufen.
 */
public enum PasswordComplexity {
    PIN("0", 4),  // Definiert eine PIN-Komplexität mit nur Ziffern und einer Länge von 4.
    SIMPLE("aA", 5),  // Einfache Komplexität mit Groß- und Kleinbuchstaben von Länge 5.
    MEDIUM("aA0", 8),  // Mittlere Komplexität mit Buchstaben und Zahlen von Länge 8.
    COMPLEX("aA0!", 10),  // Hohe Komplexität inklusive Sonderzeichen vonLänge 10.
    SUPER_COMPLEX("aA0!", 16);  // Sehr hohe Komplexität, gleiche Zeichen wie COMPLEX, aber Länge 16.

    private final String chars;  // Zeichen, die für das Passwort verwendet werden.
    private final int length;  // Länge des zu generierenden Passworts.

    /**
     * Konstruktor für Passwortkomplexität.
     * @param chars Zeichen die in den passwörtern verwendet werden.
     * @param length Länge des Passworts.
     */
    PasswordComplexity(String chars, int length) {
        this.chars = chars;
        this.length = length;
    }

    /**
     * Gibt die für die Complexity verwendeten Zeichen zurück.
     * @return Die Zeichen als String.
     */
    public String getChars() { //Getter für chars 
        return chars;
    }

    /**
     * Gibt die Länge der Passwörter zurück.
     * @return Die Länge als int.
     */
    public int getLength() { //Getter Methode für length
        return length; 
    }

    /**
     * Generiert ein Passwort basierend auf Komplexität.
     * @return Das generierte Passwort als String.
     */
    public String generatePassword() {
        Random random = new Random();
        String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!?+-;,.:"; //Beinhaltet alle erlaubten Zeichen in einem String.
        StringBuilder password = new StringBuilder(); //StringBuilder statt String verwenden da dieser mutable ist.
        for (int i = 0; i < length; i++) {
            switch (this) {
                case PIN:
                    password.append(allowedChars.charAt(random.nextInt(10)));
                    break;
                case SIMPLE:
                    password.append(allowedChars.charAt(random.nextInt(10, allowedChars.length() - 8)));
                    break;
                case MEDIUM:
                    password.append(allowedChars.charAt(random.nextInt(allowedChars.length() - 8)));
                    break;
                case COMPLEX: case SUPER_COMPLEX:
                    password.append(allowedChars.charAt(random.nextInt(allowedChars.length())));
                    break;
            }
        }
        return password.toString(); //Password wird als String ausgegeben
    }
}
