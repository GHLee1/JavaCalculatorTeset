package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx1 {

  public static void main(String[] args) {
    // �迭
    String[] s1 = {"a", "b"};
    // ---------array---------
    System.out.println(s1[1]);
    // ����Ʈ ArrayList �� LinkedList�� ����.
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.remove(1);
    System.out.println(list);
  }
}
