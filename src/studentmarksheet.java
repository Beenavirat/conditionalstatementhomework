import java.util.Scanner;

// finding students percentage
public class studentmarksheet {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the student name  ");
        String name1 = scanner.next();
        System.out.println("enter the student  rollnum  =");
        int rollnum = scanner.nextInt(); // a=roll num
        System.out.println("enter  maths subject marks ");
        int mat1 = scanner.nextInt();
        System.out.println("enter  engliah subject marks");
        int eng1 = scanner.nextInt();
        System.out.println("enter science subject marks");
        int sci1 = scanner.nextInt();

        int total1 = eng1 + mat1 + sci1;
        double per1 = (total1 * 100.0) / 300.0;
        double per = Math.round(per1 * 100.00 / 100.00);
        System.out.println("student name is" + name1);
        System.out.println("roll number is" + rollnum);
        System.out.println("english marks" + eng1);
        System.out.println("maths marks" + mat1);
        System.out.println("science marks" + sci1);
        System.out.println("total marks" + total1);
        System.out.println("percentage is" + per+"%");
        if (per1 >= 35) {
            System.out.println("your result =pass");
        } else {
            System.out.println("your result is fail");
        }

        if (per >= 80) {
            System.out.println("your pass grade is A+");
        } else if (per >= 60) {
            System.out.println("your pass grade is A");
        } else if (per >= 50) {
            System.out.println("your pass grade is B");
        } else if (per >= 35) {

            System.out.println("your pass grade is C");
        }
    }
}