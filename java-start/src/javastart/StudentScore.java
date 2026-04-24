package javastart;

import java.util.Scanner;

class StudentP{
	String name;
	int score;
	StudentP(String name, int score){
		this.name = name;
		this.score = score;
	}
}



public class StudentScore {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("학생수를 입력하세요 : ");
		//학생수 키보드로 부터 입력
	int cnt = sc.nextInt();
	sc.nextLine();
	//학생수만큼 배열 생성
	StudentP[] stu = new StudentP[cnt];
	for(int i = 0 ; i<stu.length ;i++ ) {
	System.out.print((i+1)+"번째 학생 이름 입력 : ");
	String name = sc.nextLine();
	System.out.print("점수 입력:");
	int score = sc.nextInt();
	sc.nextLine();
	stu[i] = new StudentP(name,score);
	}

	while(true) {
		System.out.println("검색할 이름은 : ");
		String sname = sc.nextLine();
	if(sname.equals("stop"))
		break; //while 탈출
	boolean k = false;
	for(int j=0; j<stu.length ;j++) {
		
		if(stu[j].name.equals(sname)) {
			System.out.print(	sname+"의 점수는 : "+stu[j].score);
			k=true;
			break;//for 탈출
			//break는 가장 가까운 반복문을 한번만 탈출함
		}//if 괄호
		
	}//for 괄호
	if(!k) {
		System.out.println("찾는 사람이 없습니다.");
	}//if 괄호
	}//while 괄호
	sc.close();
	System.out.println("종료합니다.");
}
}