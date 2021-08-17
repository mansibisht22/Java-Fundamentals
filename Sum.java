import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Taking input from user
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;

        //Displaying the sum
        System.out.println("Sum is: " + sum);
    }
}