
public class ArrayTest {

  public static void main(String[] args) {
    int[] arrCase1 = new int[3];
    int arrCase2[] = new int[3];

    arrCase1[0] = 10;
    arrCase2[2] = 20; // 배열에 값 넣어 초기화
    System.out.println("arrCase1[0] :" + arrCase1[0]);
    System.out.println("arrCase2[2] :" + arrCase2[0]);

    String[] arrCase3 = {"A", "B", "C"};
    for (String string : arrCase3) {
      System.out.print(string);
    } // foreach for(타입 변수명: 배열){반복할 문장?}
    System.out.println(" digital export");
  }

}
