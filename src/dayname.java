import java.util.Scanner;

public class dayname {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner class
        System.out.println("enter  a number between 1 to 7 =");//input a no between 1 to 7
                int day = scanner.nextInt();
        System.out.println(getDayName(day));
    }
// get the name for the week
        public static String getDayName( int day) {
        String dayname = " ";
        switch (day) {
            case 1:
                dayname = "Monday";
                break;

            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Thursday";
                break;
            case 5:
                dayname = "Friday";
                break;
            case 6:
                dayname = "Saturday";
                break;
            case 7:
                dayname = "Sunday";
                break;
            default:
                dayname = "Invalid day range";
        }
        return dayname;
    }
        }







