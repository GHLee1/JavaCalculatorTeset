
public class ArrayTest {

  public static void main(String[] args) {
    int[] arrCase1 = new int[3];
    int arrCase2[] = new int[3];

    arrCase1[0] = 10;
    arrCase2[2] = 20; // �迭�� �� �־� �ʱ�ȭ
    System.out.println("arrCase1[0] :" + arrCase1[0]);
    System.out.println("arrCase2[2] :" + arrCase2[0]);

    String[] arrCase3 = {"A", "B", "C"};
    for (String string : arrCase3) {
      System.out.print(string);
    } // foreach for(Ÿ�� ������: �迭){�ݺ��� ����?}
    System.out.println(" digital export");
  }

}
