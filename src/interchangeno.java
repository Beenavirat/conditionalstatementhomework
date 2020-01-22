import java.util.Scanner;

public class interchangeno {

    public static void main(String[] args) {

int a,b,temp;   //VARIABLE DECLARATION
        Scanner scanner = new Scanner(System.in); // scanner class
        System.out.println("Enter the  value of A and B: =");

        System.out.println("A= "); // Enter the value of A
         a = scanner.nextInt();
        System.out.println("B= "); //Enter the value of B
         b = scanner.nextInt();
        temp=a;  //temp stores value of a
        a=b;     //a stores value of b
        b=temp;  //b stores value of temp
        System.out.println("number interchanged successfully..!!");
        System.out.println("A=" +a);  //print value ofA
        System.out.println("B=" +b);   //print value of B
    }
}