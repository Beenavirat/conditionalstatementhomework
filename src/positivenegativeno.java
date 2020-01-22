import java.util.Scanner;

public class positivenegativeno {

    public static void main(String[] args) {
        int no;
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.println("Enter your no");
        no=scanner.nextInt();
        if (no>0)
            System.out.println("The no is positive");
        if(no<0)
            System.out.println("The no is negative");
        if(no==0)
            System.out.println("The no is zero");
    }
}
