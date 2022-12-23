package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx1 {

  public static void main(String[] args) {
    // 배열
    String[] s1 = {"a", "b"};
    // ---------array---------
    System.out.println(s1[1]);
    // 리스트 ArrayList 와 LinkedList가 있음.
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.remove(1);
    System.out.println(list);
  }
}
