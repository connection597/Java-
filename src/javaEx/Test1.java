package javaEx;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		double dollar;
		
		System.out.print("��ȭ�� �Է��ϼ���(���� :��)");
		money = sc.nextInt();
		dollar = (double)money/1100;
		
		System.out.print(money +"���� $" +dollar+"�Դϴ�");
		sc.close();

	}

}
