import java.util.*;
/**
 * A recursive static method that returns nth term in Fibonacci sequence
 * 
 * @author Isabella Correa Castano
 */
public class Main
{
    
    /** 
     * @param n
     * @return int
     */
    public static int fibonacci(int n) {
        if (n<=1)
        return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    /** 
     * @param args[]
     */
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