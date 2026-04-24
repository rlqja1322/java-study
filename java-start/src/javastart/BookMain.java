package javastart;

class Book2{	//클래스 = 변수(속성)+매서드(기능)
	String title;
	String author;//멤버변수
	void show(){//매서드
		System.out.println("책 제목 :"+title+" 작가 : "+author);
	} // 14) // 16) // 18)
//생성자 오버로딩 : 매개변수가 타입이 다르거나, 순서가 다르거나, 개수가 다르면 호출  
	Book2(){ //매개변수 없는 생성자(기본생성자)
//		title = "";
//		author = "";
		this("",""); //생성자간의 호출, 2)	
		System.out.println("기본생성자 호출"); // 5)
	}
	Book2(String title){ //생성자 호출 title만 가져옴
//		this.title = title; // 왼쪽 title은 멤버변수, 오른쪽 title은 매개변수
//		author = "작가미상";
		this(title,"작가미상"); // 7)
		
	}
	Book2(String title, String author){ 
		this.title = title; // 3) //8) //11)
		this.author = author; // 4) //9) //12)
	}
}

public class BookMain {

	public static void main(String[] args) { //실행부분
		Book2 b1 = new Book2();	//객체 생성, 1) 생성자 진입
		Book2 b2 = new Book2("심청전");	//b2 : 참조변수, 6) 생성자 진입
		Book2 b3 = new Book2("폭풍의 언덕","에밀리 브론테");	//10) 생성자 진입
		
		b1.show(); //13)
		b2.show(); //15)
		b3.show(); //17)
		
	}

}
//this.는 현재 작동 중인 객체 자신을 가리키는 참조 변수입니다. 주로 매개변수와 멤버 변수의 이름이 같을 때 이를 구분하기 위해 사용
//this()는 같은 클래스 안에 있는 다른 생성자를 호출할 때 사용하는 특수한 문법입니다. 코드의 중복을 줄이기 위해 사용
//
//this() 설명
//① 생성자에서만 사용 가능
//this();  // 생성자 안에서만 사용 가능
//② 반드시 첫 줄에 써야 함
//Car() {
//    this("Avante");  // 반드시 첫 줄
//}
//
//Car() {
//    speed = 100;
//    this("Avante"); // 에러
//}
//③ 자기 자신을 계속 호출하면 안됨 (무한루프)
//Car() {
//    this(); //  무한 호출 → 컴파일 에러