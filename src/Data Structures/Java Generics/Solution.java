import java.util.Arrays;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 2, 3);

    List<String> strings = Arrays.asList("Hello", "World");

    printArray(integers);

    printArray(strings);
  }

  public static <T> void printArray(List<T> array) {
    array.forEach(System.out::println);
  }
}
