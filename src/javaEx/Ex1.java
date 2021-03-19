package javaEx;

public class Ex1 {
//두정수 사이의 합
	public static void main(String[] args) {
		class Solution{
			public long solution( int a, int b) {
				long answer =0;
				long total =0;
				if(a>b) {
					int tmp =0;
					tmp =a;
					a =b;
					b= tmp;
				}
				for(int start =a; start <=b; start++) {
					total +=start;
				}
				return total;
			}
		}

	}

}
