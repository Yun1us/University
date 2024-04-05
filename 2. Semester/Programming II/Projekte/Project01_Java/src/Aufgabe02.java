public class Aufgabe02 {
    public static void main(String[] args){
    switch(args.length){
        case 1:
            System.out.println("Kugel: ");
        case 2:
            System.out.println("Pyramide: ");
        case 3:
            System.out.println("Quader: ");
        default:
            System.out.println("Invalid Parameter was given!");
    }
    }
}
