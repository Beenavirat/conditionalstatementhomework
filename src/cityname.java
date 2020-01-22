import java.util.Scanner;

public class cityname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  any alphabetr: =");
        String alphabet=scanner.next().toUpperCase();
        char ch=alphabet.charAt(0);
        switch(ch) {
            case 'A':
                System.out.println("Anand");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Dakor");
                break;
            case 'E':
                System.out.println("Ealing");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid entry");

        }

        }
    }




