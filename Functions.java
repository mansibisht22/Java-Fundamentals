import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        int sum = sum();
        System.out.println(sum);

        String msg = greeting();
        System.out.println(msg);
    }

    static int sum(){

        System.out.println("Enter 2 numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        return a+b;
    }

    static String greeting(){
        return "Hello World!";
    }


}
