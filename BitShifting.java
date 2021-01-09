public class BitShifting {
    public static void main(String args[]) {
        // n-bit representation of a nunber in binary form 
        // i.e., decimal to binary conversioin
        int x=3;
        for(int i=3; i>=0; i--){
            if((x & 1<<i) == 0){  
                System.out.print(0);
            }
            else System.out.print(1);
      }
    }
}