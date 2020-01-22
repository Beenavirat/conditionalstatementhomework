import java.util.Scanner;

public class eligibleforvote {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.println("Enter your age");
        age=scanner.nextInt();
        if(age>=18)
            System.out.println("You are eligible to vote." );
        else
            System.out.println( "You are note eligible to vote");





    }


}
