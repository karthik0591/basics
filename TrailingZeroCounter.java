import java.util.Scanner;

public class TrailingZeroCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        ZeroCalculator zc = new ZeroCalculator();
        int result = zc.trailingZeroes(n);
        System.out.println("Trailing zeroes in " + n + "! = " + result);
    }
}

class ZeroCalculator {
    public int trailingZeroes(int n) {
        if(n < 5) {
            return 0;
        }
        int count = 0;
        while(n >= 5) {
            count += (n / 5);
            n /= 5;
        }
        return count;
    }
}

