package javaEx;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		double dollar;
		
		System.out.print("원화를 입력하세요(단위 :원)");
		money = sc.nextInt();
		dollar = (double)money/1100;
		
		System.out.print(money +"원은 $" +dollar+"입니다");
		sc.close();

	}

}
