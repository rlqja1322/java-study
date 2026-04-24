package javastart;

class Student { //클래스(설계도) 생성
   //클래스 = 멤버변수(필드) + 메서드 (기능) 구성
   String name; //멤버변수
   int score; //멤버변수
   //생성자(constructor) : 객체 생성시에 값을 부여함
   //객체생성할때 1번 수행
   Student(String n, int s){ //생성자(클래스 이름과 동일)
      name = n;
      score = s;
   }
   
   
   
   

   //매서드 정의(기능)
   void printInfo() { // 메서드는 클래스 안에 작성 + 중괄호 필수
      System.out.println(name + "," + score);
   }
}

public class Main {
public static void main(String[] args)//main method
{
   Student s1 = new Student("홍길동",90); //객체(인스턴스) 생성
   Student s2 = new Student("이순신",100);
   //student() : 클래스
   //new : 객체 생성 연산자
   //s1 : 참조변수, 객체 생성
   
//   s1.name = "홍길동"; // .(점)은 멤버 접근 연산자
//   s1.score = 90;
//   
   
   System.out.println("이름은 "+s1.name);
   System.out.println("점수는 "+s1.score);
      
   s1.printInfo();//매서드 호출 (객체의 기능 실행)

   s2.name = "이순신";
   s2.score = 100;

   System.out.println("이름은 "+s2.name);
   System.out.println("점수는 "+s2.score);
   
   s2.printInfo(); //매서드 호출
}
}