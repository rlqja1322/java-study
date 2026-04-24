package javastart;

class Circle{
int radius;
	double getArea() { //메서드
	return 3.14*radius*radius; 
	}
	Circle(int radius){ // 생성자 : 객체 생성시 초기화
		this.radius = radius; // 매개변수 값을 객체 변수에 저장
	}
	
}
	public class Array {
	public static void main(String[] args) {
	
	Circle [] c;
	c = new Circle[5]; //5개의 방
	//Circle [] c = new Circle[5];
	
	
    // 배열에 Circle 객체 생성하여 저장
    // 배열은 반복문으로 처리하는 경우가 많음
	for(int i=0 ;i < c.length; i++) { //배열은 대부분 for문을 사용한다
		c[i] = new Circle(i);
	}
	for(int j=0 ; j < c.length; j++) {
			System.out.println(c[j].getArea());
	}
}
}
