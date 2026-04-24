package javastart;

import java.util.Scanner;

class BookA{
	String title;
	int price;
	BookA(String title, int price){
	this.title = title;
	this.price = price;
	}
}
public class BookArray {
public static void main(String[] args) {
	BookA[] b = new BookA[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<b.length ; i++) {
			System.out.println("제목입력 : ");
		String title = sc.nextLine();
		
		System.out.println("가격입력 : ");
		int price = sc.nextInt();
		b[i] = new BookA(title,price); // 배열 요소 객체 생성
		sc.nextLine();
		}
		
	for(int j = 0; j<b.length;j++) {
		System.out.println("제목은 : "+b[j].title+ " \n가격은 : "+b[j].price);
}
	sc.close();
}
}