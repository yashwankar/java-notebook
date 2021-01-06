import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class FibQue {
    public static void main(String[] args) {
        // Creating Queue using the LinkedList class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int count = sc.nextInt();   //for user input
        sc.close();
        int a=0,b=1,c=a+b;          //initializing sequence elements
        
        Queue<Integer> numbers = new LinkedList<>();
        // offer elements to the Queue
        for(int i=0; i<count; i++)
        {
            numbers.offer(a);
            a = b;
            b = c;
            c = a+b;
        }
        System.out.println("Fibonacci Series using queue is :");
        
        //removing head elements to view the queue
        for(int i=0; i<count;i++)
            System.out.print(numbers.poll()+" ");
    }
}