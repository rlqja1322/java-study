package test;

class Book {
	String title;

	Book(String title) {
		this.title = title;
	}
}

public class Ex05 {
	public static void main(String[] args) {

		Book[] b = new Book[3]; // 배열은 한 번만 선언 (3칸)

		b[0] = new Book("총균쇠");
		b[1] = new Book("노인과 바다");
		b[2] = new Book("위대한 게츠비");

		for(int i = 0 ; i < b.length ; i++) { // length에 괄호가 있으면 문자열 괄호가 없으면 배열
			System.out.println(b[i].title);
		}
	}
}