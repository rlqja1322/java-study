package ex1;

public class Main {
public static void main(String[] args) {
	Dog d = new Dog(); //자식 객체
	
	System.out.println("부모 멤버 사용");
	d.name="똘똘이";
	d.age=2;
	d.color="하얀색";
	
	System.out.println("이름 : "+d.name+" 나이 : "+d.age+" 색깔 : "+d.color);
	
	//d.eat(); Animal 클래스에서 가져옴
	//d.sleep(); 부모
	d.bark();//Dog 클래스에서 가져옴
	d.run();//자식
}
}
