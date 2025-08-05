import java.util.*;

public class Main {
    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read two space-separated integers
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // Calculate LCM
        int lcm = (A * B) / gcd(A, B);
        
        // Print the result
        System.out.println(lcm);
    }
}
