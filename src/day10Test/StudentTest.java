package day10Test;

public class StudentTest {
  public static void main(String[] args) {
    // static����
    Student lee = new Student();

    lee.setStudentName("�̰���");
    System.out.println(lee.serialNum);

    lee.serialNum++;

    Student kim = new Student();
    kim.setStudentName("��浿");
    System.out.println(kim.serialNum);
    System.out.println(lee.serialNum);

  }
}
