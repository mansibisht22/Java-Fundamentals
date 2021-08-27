import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
            //Program to display Month for a number entered by user
            //USING MODERN SWITCH CASE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number to obtain month name: ");
            int n = scan.nextInt();

            switch (n){
                case 1-> System.out.println("January");
                case 2-> System.out.println("February");
                case 3-> System.out.println("March");
                case 4-> System.out.println("April");
                case 5-> System.out.println("May");
                case 6-> System.out.println("June");
                case 7-> System.out.println("July");
                case 8-> System.out.println("August");
                case 9-> System.out.println("September");
                case 10-> System.out.println("October");
                case 11-> System.out.println("November");
                case 12-> System.out.println("December");
                default -> System.out.println("ENTER VALID MONTH");
            }

    }
}
