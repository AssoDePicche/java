import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int n1, n2, n3, n4, n5;

    Scanner scanner = new Scanner(System.in);

    n1 = scanner.nextInt();

    n2 = scanner.nextInt();

    n3 = scanner.nextInt();

    n4 = scanner.nextInt();

    n5 = scanner.nextInt();

    scanner.close();

    Solution.check(n1);

    Solution.check(n1, n2);

    Solution.check(n1, n2, n3);

    Solution.check(n1, n2, n3, n4, n5);
  }

  public static void check(int... args) {
    String output = "";

    for (int arg : args) {
      if (isPrime(arg)) {
        output += String.valueOf(arg) + " ";
      }
    }

    System.out.println(output);
  }

  public static boolean isPrime(int arg) {
    if (arg < 2) {
      return false;
    }

    for (int i = 2; i * i <= arg; i++) {
      if (arg % i == 0) {
        return false;
      }
    }

    return true;
  }
}
