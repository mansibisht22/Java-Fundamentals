import java.util.Scanner;

public class Function_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Wheel of Fortune!- Pick a number between 1 and 10");
        int num = in.nextInt();

        message(num);
    }

    static void message(int num){
        if(num>=5)
            System.out.println("Aww, better luck next time.");

        else
            System.out.println("You won 4 rupees >_<");
    }
}
