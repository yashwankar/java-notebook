import java.util.Scanner;

public class Donation
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-- >0){
            int N = sc.nextInt();
            int donate = N/2;
            N -= donate;
          
            donate = N/2;
            N -= donate;
          
            System.out.println(N);
      }
	}
}
