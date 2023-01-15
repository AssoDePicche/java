import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int a, b, n, queries, aux = 0;

    String serie;

    Scanner scanner = new Scanner(System.in);

    queries = scanner.nextInt();

    while (queries != 0) {
      a = scanner.nextInt();

      b = scanner.nextInt();

      n = scanner.nextInt();

      aux += a + Math.pow(2, 0) * b;

      serie = String.valueOf(aux);

      for (int i = 1; i < n; i++) {
        aux += Math.pow(2, i) * b;
        
        serie += " " + String.valueOf(aux);
      }

      System.out.println(serie);

      aux = 0;

      queries--;
    }

    scanner.close();
  }
}
