import java.util.Scanner;

public class uppertolower {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet in Upper case: =");
        String alpha=scanner.next().toLowerCase();
       char alphabet =alpha.charAt(0);

        System.out.println("Lower case of entered alphabet is" +alphabet);
    }


}
