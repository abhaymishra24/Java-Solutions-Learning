import java.util.Scanner;

public class coronaques {
    public int solve(int A, int B, int C) {
   
        int days = 0;
        while (C > 0) {
            C -= A;
            C += B;
            days++;
        }
        return days;
    }

     public static void main(String[] args) {
         Scanner A =  new Scanner(System.in);
         Scanner B = new Scanner(System.in);
         Scanner C = new Scanner(System.in);
        System.out.println("Minimum number of days to reach 0 active cases: ");
    }
}
   