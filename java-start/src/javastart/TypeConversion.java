package javastart;

public class TypeConversion {
	//타입 변환
public static void main(String[] args) {
	byte b = 127; //1바이트 정수 -128~127까지 저장 가능 
	int i = 100;
System.out.println(b+i);// b가 int 타입으로 자동 변환	
System.out.println(10/4);	
System.out.println(10.0/4);	// 4가 4.0으로 자동 변환
System.out.println((byte)(b+i));
//바이트는 8비트 -128~127
//4바이트 -> 1바이트 오버플로우 발생 -> 원하지 않은 답이 나옴
System.out.println((int)2.9 + 1.8);	//소수 이하 버림
System.out.println((int)(2.9 + 1.8));	
System.out.println((int)2.9 + (int)1.8);	
System.out.println((double)10 / 4);
// 정수/정수 -> 정수 => *강제형변환* -> 실수 -> 2.5
int a = 10;
double result = a + 3.5;
System.out.println(result);
}

}