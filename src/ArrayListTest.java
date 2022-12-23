import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {

  public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two"));
    for (String number : numbers) {
      System.out.println(number);
    }
  }



}
