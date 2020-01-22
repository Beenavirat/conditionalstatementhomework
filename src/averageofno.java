import java.util.Scanner;

public class averageofno {

int total;
    float avg;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner class


        System.out.println("A= "); // Enter the value of A
      int  a = scanner.nextInt();
        System.out.println("B= "); //Enter the value of B
       int b = scanner.nextInt();
        System.out.println("C= "); // Enter the value of C
        int  c = scanner.nextInt();
        System.out.println("D= "); //Enter the value of D
        int d = scanner.nextInt();
        System.out.println("E= "); // Enter the value of E
        int  e = scanner.nextInt();
        System.out.println("sum is" + (a+b+c+d+e));  // sum is   total of A+B+C+D+E
        System.out.println("Average is "+(a+b+c+d+e)/5.0 );  //AVERAGE=sum/5



    }




}
