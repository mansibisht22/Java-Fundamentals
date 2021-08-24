import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Program to display WeekDay for a DAY NUMBER INPUT BY USER
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to obtain day name: ");
        int n = scan.nextInt();

        switch (n){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("NOT VALID");


        }
    }
}
