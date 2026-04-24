package ex2;

public class Main2 {

public static void main(String[] args) {
	
	Dog2 a = new Dog2();
	
	a.sound(); //자식의 메서드를 수행한다
	a.move();
	
	Animal2 b = new Animal2();
	b.sound();
	b.move();
}
}
