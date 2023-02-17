import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Checker checker = new Checker();

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    Player[] players = new Player[n];

    while (n-- != 0) {
      players[n] = new Player(scanner.next(), scanner.nextInt());
    }

    scanner.close();

    Arrays.sort(players, checker);

    for (Player player : players) {
      System.out.printf("%s %d\n", player.getName(), player.getScore());
    }
  }
}
