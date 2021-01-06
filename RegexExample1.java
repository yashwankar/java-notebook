import java.util.regex.*;

public class RegexExample1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[1-2]9bce[0-9][0-9][0-9]"); // . represents single character
        // String[] arr = {"as", "mk", "mks", "mst", "amms", "mas"};
        String[] arr = { "19bce401", "19bce10101", "18bce10201", "17bce102", "19BCE11011", "19bce1020123", "19bce00123", };
        System.out.println("Pattern :- \t" + p);
        for (int i = 0; i < arr.length; i++) {
            Matcher m = p.matcher(arr[i]);
            boolean b = m.matches();
            System.out.println(arr[i] + ":-\t\t" + b);
        }
    }
}