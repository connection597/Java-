package javaEx;
//������ ���� ���α׷� ���� 
import java.util.Scanner;
	class Bank{
		String name;
		int pass;
		int money;
		Bank(String name, int pass, int money){
			this.name= name;
			this.pass = pass;
			this.money =money;
		}
		public void setInput() {
			Scanner i = new Scanner(System.in);
			System.out.println("�Աݾ�?:");
			int inmoney = i.nextInt();
			money = money +inmoney;
			System.out.println("�Ա��� �ܾ���ȸ" + money);
		}
		public void setOutput() {
			Scanner o = new Scanner(System.in);
			System.out.println("��ݾ� :");
			int outmoney = o.nextInt();
			money = money-outmoney;
			System.out.println("��� �� �ܾ���ȸ" + money);
		}
		public void getBalance() {
			System.out.println("�ܾ���ȸ" + money);
		}
		
	 
	}
	public class BankingProgram {
	public static void main(String[] args) {
		Bank b = new Bank("���ػ�",4567,15500);
		while(true) {
			System.out.printf("1�Ա� \n2. ��ݾ�\n3.�ܾ���ȸ\n4.����\n");
			Scanner ch = new Scanner(System.in);
			switch(ch.nextInt()){
			case 1:
				b.setInput();
				break;
			case 2:
				b.setOutput();
				break;
			case 3:
				b.getBalance();
				break;
			case 4:
				break;
			}
		}

	}
	private static void printf(String string) {
		
	}

}
