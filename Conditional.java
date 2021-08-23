import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Program to find Largest Number

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //let's assume that a is maximum
        int max = a;

        if(b>max){
            max=b;
        }

        if(c>max){
            max=c;
        }

        System.out.println(max);
    }
}
