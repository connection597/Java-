package javaEx;

import java.util.Scanner;

//환율계산
public class Ex0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원 )");
		
		int won = sc.nextInt();
		double dollor = (double)won/1100; //형변환
		
		System.out.println(won +"원은" +String.format("%.2f", dollor)+"달러 입니다");
		//String.format 반올림
	}

}
