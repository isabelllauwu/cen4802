import java.util.*;

public class Main
{
    public static int fibonacci(int n) {
        if (n<=1)
        return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String args[])
    
    {
        int n;
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Enter N:");
            n=scnr.nextInt();
            System.out.println("The " +n+ "th term of fibonacci sequence is " +fibonacci(n));
        }
    }
        
    
}