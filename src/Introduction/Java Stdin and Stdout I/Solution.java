import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> integers = new ArrayList<>();

    Integer integer;

    for (int i = 0; i < 3; i++) {
      integer = scanner.nextInt();

      integers.add(integer);
    }

    scanner.close();

    for (int item : integers) {
      System.out.println(item);
    }
  }
}
