import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("================================");

    for (int i = 0; i < 3; i++) {
      String stringInput;

      int count, integerInput, necessarySpaces;

      stringInput = scanner.next();

      integerInput = scanner.nextInt();

      necessarySpaces = 18 - (stringInput.length() + 3);

      count = 0;

      while (count < necessarySpaces) {
        stringInput += " ";

        count++;
      }

      if (integerInput < 10) {
        stringInput += "00";
      }

      if (integerInput >= 10 && integerInput < 100) {
        stringInput += "0";
      }

      System.out.printf("%s%d\n", stringInput, integerInput);
    }

    System.out.println("================================");

    scanner.close();
  }
}
