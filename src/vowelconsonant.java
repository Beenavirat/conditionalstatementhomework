import java.util.Scanner;

public class vowelconsonant {
// Java  main method
    public static void main(String[] args) {
        char ch;  // declare as variable
//created object of scanner class
        Scanner scanner = new Scanner(System.in); //scanner class
        System.out.println("enter  any character: ="); //  To print input character
        ch = scanner.next().charAt(0);// for input character
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')// if condition
        {
            System.out.println(" input  character isVowel");// condition true so statement execute

        } else    //else  statement
            {
            System.out.println(" input character is Consonant");// if condition false so else part execute

        }

    }




}