package day10;

public class CompanyTest {
  public static void main(String[] args) {

    // Company test = new Company(); //�����ڸ� private�� ���������߱⶧���� ������.

    Company com1 = Company.getInstance();
    Company com2 = Company.getInstance();

    System.out.println(com1 == com2);
  }
}
