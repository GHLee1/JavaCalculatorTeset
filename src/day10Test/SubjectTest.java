package day10Test;

import java.util.ArrayList;
import java.util.Scanner;

class Person1 {
  // �й�,����,����,����
  public int sno;
  public int kor;
  public int math;
  public int eng;

  public Person1() {}

  public Person1(int sno, int kor, int math, int eng) {
    this.sno = sno;
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }

  public int getSno() {
    return sno;
  }

  public void setSno(int sno) {
    this.sno = sno;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  @Override
  public String toString() {
    return "[�л��� �й� : " + sno + ", �������� :" + kor + ", �������� : " + math + ", �������� : " + eng + "]";
  }



}


public class SubjectTest {

  public static void main(String[] args) {
    // �Է� ��ȸ ���� ����
    Person1 ps = new Person1();
    Scanner sc = new Scanner(System.in);
    ArrayList<Person1> arr = new ArrayList<Person1>();
    System.out.println("�л� ���� �ý��� �Է�");
    int index = 0;

    while (true) {
      System.out.println("0. ����\t 1.�Է�\t 2.��ȸ");
      int input = sc.nextInt();
      // 1�� �Է��� �� ���� temp�� �׿��� �ε��� ������ �÷��ش�.

      if (input == 0) {
        System.out.println("�ý����� �����մϴ�.");
        break;
      } else if (input == 1) {

        System.out.println("�й��� �Է��ϼ��� : ");
        int sno_id = sc.nextInt();
        System.out.println("�������� �Է��ϼ��� : ");
        int kor_score = sc.nextInt();
        System.out.println("�������� �Է��ϼ��� : ");
        int math_score = sc.nextInt();
        System.out.println("�������� �Է��ϼ��� : ");
        int eng_score = sc.nextInt();
        for (int i = 0; i < index + 1; i++) {
          arr.add(i, new Person1(sno_id, kor_score, math_score, eng_score));

        }
        index++;
      } else if (input == 2) {
        System.out.println("�й��� �Է��ϼ���");
        int sno_id = sc.nextInt();
        // ��ȸ �� ����� �й��� �Է¹ް� ��ȸ�� list���� contain���������� list�� tostring
        // arraylist�� ����for�� Ǯ�� arr.get
        // arr.get(0).getSno();


        // ��ȸ
      }



    }


  }

}
