package javastart;

public class Val2 {
public static void main(String[] args) {
	final double PI = 3.14;//final은 불변
	double res = PI *10;
	double res1 = PI *10;	
	System.out.println(res1);
	
	var x=5;	// var은 변수의 초기값에 알아서 변수가 형성됨(초기값없으면 안나옴)
	System.out.println(x++ + ++x);
	//(x++)+(++x) x++가 5가 되고 +을 거치면서 넘어가는 과정에서 +1이 추가 됨, 그리고 ++x가 더해져서 12가 나옴

System.out.println(2*1500+300+"hello");
	var k = 30.5;
	var y = 12.3f;
	var n = "java";
	System.out.println(k+", "+y+", "+n);

}
}
