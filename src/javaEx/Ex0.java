package javaEx;

import java.util.Scanner;

//ȯ�����
public class Ex0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���(���� �� )");
		
		int won = sc.nextInt();
		double dollor = (double)won/1100; //����ȯ
		
		System.out.println(won +"����" +String.format("%.2f", dollor)+"�޷� �Դϴ�");
		//String.format �ݿø�
	}

}
