import java.util.Scanner;

public class Functions_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        System.out.println("Enter the value of b: ");
        int b = in.nextInt();

        System.out.println("After Swapping: ");
        swap(a,b);
    }

    static void swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;

        System.out.println("a: " + a + " b: " + b);

    }
}
