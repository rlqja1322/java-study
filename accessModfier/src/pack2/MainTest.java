package pack2;

import pack1.Parent; //public 클래스는 어디서나 객체 생성 가능
//하지만 다른 패키지 일 경우 import 해야함

public class MainTest {

	public static void main(String[] args) {
		Parent pa = new Parent(); //부모 객체 생성
		Child ch = new Child();	//자식 객체 생성
		
		System.out.println("=== 일반 객체 접근 ==="); 
		System.out.println("public a =" + pa.a); 
		//public은 모든 패키지에서 사용 가능
		System.out.println("protected b = " + pa.b);
		//protected는 객체 접근 불가능
		System.out.println("default c = " + pa.c);
		//default는 다른 패키지라 불가능
		System.out.println("private d = " + pa.d); 
		//private는 같은 클래스 외에 다른 곳에서 사용 불가능
		ch.printChild();
	
	}

}
