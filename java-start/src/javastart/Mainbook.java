package javastart;

class Book{
   String title;//책제목
   int price;//가격  
//생성자의 오버로딩
   Book(String a, int b){ //객체생성시 인자 2개
	   title = a;
	   price = b;
	   System.out.println("도서제목 : " + title + "   가격 : " + price);
   }   

   Book(String a){ //갱체생성시 인자 1개
	   title = a;
	   price = 0;
   }
   Book(){// 아무것도 보내지않음
	   title = "c언어 정석";
	   price = 0;
   }

   void showPrice(){ //메서드 추가
	   System.out.println("도서제목 : " + title + "   가격 : " + price);
   }
}

public class Mainbook {

   public static void main(String[] args) {
   		Book myBook = new Book("자바의 정석",20000);
   		Book myBook2 = new Book("파이썬의 정석");
   		Book myBook3 = new Book();
   
//      Book s1 = new Book(); 
//      s1.title = "자바의 정석";
//      s1.price= 20000;
//      s1.showPrice();

   		 myBook.showPrice();
   		myBook2.showPrice();
   		myBook3.showPrice();
   }
}