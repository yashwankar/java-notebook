import java.util.Scanner;
public class CalcHCF {
    static final Scanner sc = Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numvers to find is GCD : ");
        int n1 = sc.nextint();
        int n2 = sc.nextint();
        int ans = hcf(n1, n2);
        System.out.println("G.C.D of the numbers is " + ans);
    }

    public static int hcf(int n1, int n2) {
        if (n2 != 0) {
            return hcf(n2, n1 % n2);
        } else
            return n1;
    }
}
