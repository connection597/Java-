package javaEx;
//간단한 은행 프로그램 연습 
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
			System.out.println("입금액?:");
			int inmoney = i.nextInt();
			money = money +inmoney;
			System.out.println("입금후 잔액조회" + money);
		}
		public void setOutput() {
			Scanner o = new Scanner(System.in);
			System.out.println("출금액 :");
			int outmoney = o.nextInt();
			money = money-outmoney;
			System.out.println("출금 후 잔액조회" + money);
		}
		public void getBalance() {
			System.out.println("잔액조회" + money);
		}
		
	 
	}
	public class BankingProgram {
	public static void main(String[] args) {
		Bank b = new Bank("김해산",4567,15500);
		while(true) {
			System.out.printf("1입금 \n2. 출금액\n3.잔액조회\n4.종료\n");
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
