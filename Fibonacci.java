// PROGRAM1 : Fibonacci Series

import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]) {
      
        //first two terms
        int n1=0, n2=1,nxt, count=0,total;
        Scanner inp = new Scanner(System.in);
        //taking inputs of terms
        System.out.print("Enter the number of terms in fib series : ");
        total=inp.nextInt();
        inp.close();
        System.out.println("Fibonacci series is : ");
        while (count < total)
        {
           System.out.print(n1+" ");  //printing the series
           nxt = n1 + n2;
           // updating values
           n1 = n2;
           n2 = nxt;
           count += 1;
        }
    }
}
/*
OUTPUT:
Enter the number of terms in fib series : 7                                                                                                                                        
Fibonacci series is :                                                                                                                                                              
0 1 1 2 3 5 8


EXPLANATION:
Initial terms n1 and n2 are initialized to 0 and 1.
An input is taken to track record the number of terms required.
Logic is used to assign the nxt value to the sum of previous terms of the series.
Finally, the current term is printed via the n1 variable to the console.
*/