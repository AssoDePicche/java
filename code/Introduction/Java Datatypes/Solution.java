import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int testCases;

    long number;

    Scanner scanner = new Scanner(System.in);

    testCases = scanner.nextInt();

    while (testCases-- != 0) {
      try {
        number = scanner.nextLong();

        System.out.println(number + " can be fitted in:");

        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
          System.out.println("* byte");
        }

        if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
          System.out.println("* short");
        }

        if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
          System.out.println("* int");
        }

        if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
          System.out.println("* long");
        }
      } catch (Exception exception) {
        System.out.println(scanner.nextLine() + " can't be fitted anywhere.");
      }
    }

    scanner.close();
  }
}
