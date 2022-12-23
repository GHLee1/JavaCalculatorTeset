package day4;

public class PrintfTest {
  public static void main(String[] args) {
    /*
     * Printf��� Ư���� format�� �����ؼ� ��� %d ����, %s ���ڿ� , %f �Ǽ��� , %c ������ , %n �ٹٲ�, %b boolean�� , %t date,
     * time��, %o 8������ ������ , %x 16������ ������ ���
     */
    System.out.printf("������� %d%n", 15);
    // %d ������ ������ ��
    System.out.printf("������� %s", "�������");

    // -����ǥ��
    // %����d ������ �ڸ���
    // ��ȣ�� ��� ��.
    System.out.printf("[%10d]%n", 10);
    System.out.printf("[%-10d]%n", 10);
    System.out.printf("[%010d]%n", 10);

    // �Ǽ�ǥ��
    // %��ü�ڸ���.�Ҽ����Ʒ��ڸ�f
    System.out.printf("[%10.2f]%n", 3.141516);
    System.out.printf("[%-10.2f]%n", 3.141516);
    System.out.printf("[%010f]%n", 3.141516);

    // ����
    System.out.printf("%s%n", "coding");
    System.out.printf("%S%n", "coding");


  }
}
