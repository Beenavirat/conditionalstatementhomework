import java.util.Scanner;

public class AlphabetDigitSpecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter  any character: =");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z'))
        {
            System.out.println(ch + " is A Alphabet");
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println(ch + " is a digit");
        }
        else
        {
            System.out.println(ch + "is a special character");
        }
    }








}
