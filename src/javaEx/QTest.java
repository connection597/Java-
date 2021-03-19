package javaEx;

import java.util.Scanner;

//연습문제 1부터 n개 까지 정수 합구하기
public class QTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 부터 n까지 합을 구합니다");
		System.out.print("n의 값:");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =1; i<=n; i++)
			sum +=i;
		System.out.println("1부터 "+n+ "까지의 합"+sum+"입니다");
		

	}

}
