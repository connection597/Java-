package javaEx;

import java.util.Scanner;

//�������� 1���� n�� ���� ���� �ձ��ϱ�
public class QTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ���� n���� ���� ���մϴ�");
		System.out.print("n�� ��:");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =1; i<=n; i++)
			sum +=i;
		System.out.println("1���� "+n+ "������ ��"+sum+"�Դϴ�");
		

	}

}
