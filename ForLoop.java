public class ForLoop {
    public static void main(String[] args) {
        //Fibonacci Sequence

        int n=10, i, n1=0, n2=1;

        System.out.println("Fibonacci Sequence till " + n + " terms");

        for(i=1; i<=n; i++){
            System.out.println(n1);
            int next = n1+n2;
            n1=n2;
            n2=next;
        }
    }
}
