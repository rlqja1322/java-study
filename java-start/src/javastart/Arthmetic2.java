package javastart;

public class Arthmetic2 {
public static void main(String[] args) {
	int i = 20;
	double j = 10.5;
	int res1 = sum(i, 10);
	double res2 = sum(i, j);
	System.out.println(res1);
	System.out.println(res2);
	
}
public static int sum(int x,int y){

return x+y;	
}
public static double sum(double x, double y){
	return x+y;
}

}
//메서드 오버로딩
// -> 같은 이름의 메서드를 생성한다
// -> 매개변수의 타입(형)과 개수와 순서가 다름
// -> 반환 타입은 관계없음
//
//sum(int a,int b)
//sum(double a, double b)	-> 오버로딩
//
//sum(int a, int b)
//sㅕm(int a, int b, int c)	-> 가능
//
//sum(int a, double b)
//sum(double a, int b)	-> 가능
//
//int sum(int a, int b)
//double sum(int x, int y)	-> 오류

