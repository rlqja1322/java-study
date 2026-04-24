package javastart;

import java.util.Scanner;

public class ScannerEx2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("가격: ");
      int price=sc.nextInt();

      System.out.println("수량: ");
      double quan=sc.nextDouble();

      sc.nextLine();
      System.out.println("상품명: ");
      String name=sc.nextLine();

      //문자열 입력 -> 숫자 입력-> 문제없음
      // 숫자 -> 문자열 -> 엔터키를 상쇄  sc.nextLine();
      //문자열은 순서가 바뀐다면 
      System.out.println("회원여부(true/false):");
      boolean mem=sc.nextBoolean();
      
      System.out.println(name);
      System.out.println(price);
      System.out.println(quan); 
      if(mem) {//boolean이면 mem == true
      System.out.println("회원입니다");
      }
      else {
         System.out.println("비회원입니다");
      }
      sc.close();
      //총금액(tot) : 수량 * 가격
      int tot = (int)(quan * price);
      //할인 적용 : 회원(true)이면 10% 할인
      System.out.println("상품명: " + name);
      System.out.println("총 금액: " + tot );

      if(mem) {
          System.out.println("회원 할인 적용됨 (10%)");
      }
   }
}
