package pack1;

public class ParentTest {
public static void main(String[] args) {
	Parent p = new Parent();
	System.out.println("=== 같은 패키지 테스트 ===");
	System.out.println("public a ="+ p.a);
	System.out.println("protected b = " + p.b);
	System.out.println("default c = " + p.c);
	System.out.println("private d = "); 
	//private은 동일 클래스가 아니면 접근 할 수 없음
	System.out.println("\n=== 메서드 호출 ===");
}

}
}
