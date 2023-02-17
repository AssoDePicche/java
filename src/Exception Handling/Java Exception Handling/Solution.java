import java.lang.Exception;
import java.util.Scanner;

public class Solution {
  public static final MyCalculator calculator = new MyCalculator();

  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n, p;

    while (scanner.hasNextInt()) {
      n = scanner.nextInt();

      p = scanner.nextInt();

      try {
        System.out.println(calculator.power(n, p));
      } catch (Exception exception) {
        System.out.println(exception);
      }
    }

    scanner.close();
  }
}
