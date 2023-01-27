import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    ArrayList<String> formmatedList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    String string = scanner.nextLine();

    scanner.close();

    String[] split = string.split("[!,?. '_@']");

    for (String token : split) {
      if (!token.isEmpty()) {
        formmatedList.add(token);
      }
    }

    System.out.println(formmatedList.size());

    for (String word : formmatedList) {
      System.out.println(word);
    }
  }
}
