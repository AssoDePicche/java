import java.util.Scanner;

public class Solution {
  public static int breadth = 0;

  public static int height = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Solution.breadth = scanner.nextInt();

    Solution.height = scanner.nextInt();

    scanner.close();

    if (Solution.breadth <= 0 || Solution.height <= 0) {
      System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else {
      System.out.println(Solution.breadth * Solution.height);
    }
  }
}
