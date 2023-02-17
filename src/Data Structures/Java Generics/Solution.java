public class Solution {
  public static void main(String[] args) {
    Integer[] intArray = { 1, 2, 3 };

    String[] strArray = { "Hello", "World" };

    Solution.printArray(intArray);

    Solution.printArray(strArray);
  }

  public static <Type> void printArray(Type[] array) {
    for (Type x : array) {
      System.out.println(x);
    }
  }
}
