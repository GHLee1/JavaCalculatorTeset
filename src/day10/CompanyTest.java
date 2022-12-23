package day10;

public class CompanyTest {
  public static void main(String[] args) {

    // Company test = new Company(); //생성자를 private로 접근제한했기때문에 못만듦.

    Company com1 = Company.getInstance();
    Company com2 = Company.getInstance();

    System.out.println(com1 == com2);
  }
}
