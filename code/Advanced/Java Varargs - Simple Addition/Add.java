public class Add {
  public void add(int... args) {
    int sum = 0;

    String output = "";

    for (int arg : args) {
      sum += arg;

      output += String.valueOf(arg) + "+";
    }

    output = output.substring(0, output.length() - 1);

    System.out.println(output + "=" + sum);
  }
}
