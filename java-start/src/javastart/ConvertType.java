package javastart;

import java.util.Scanner;
public class ConvertType {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자를 문자로 입력하세요 : ");
	
		String input = scanner.nextLine();
		double d = Double.parseDouble(input);
		
		String str1 = Double.toString(d);
		String str2 = String.valueOf(d);
		
		System.out.println("입력 문자열 : "+input);
		System.out.println("숫자로 변환 : "+d);
		System.out.println("다시 문자열로 변환(toString) : "+str1);
		System.out.println("다시 문자열로 변환(valueOf) : "+str2);
		
		scanner.close();
}
}
