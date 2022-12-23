package day10Test;

public class StudentTest {
  public static void main(String[] args) {
    // staticº¯¼ö
    Student lee = new Student();

    lee.setStudentName("ÀÌ°ÇÈñ");
    System.out.println(lee.serialNum);

    lee.serialNum++;

    Student kim = new Student();
    kim.setStudentName("±è±æµ¿");
    System.out.println(kim.serialNum);
    System.out.println(lee.serialNum);

  }
}
