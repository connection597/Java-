package javaEx;

public class Q15596 {
//정수 n개가 주어졌을때 n개의 합을 구하는 함수 작성하시오
	static long sum(int[]a) {
		int ans =0;
		for(long val :a)ans +=val;
		return ans;
	}
	public static void main(String[] args) {
		int[] a = {5,12,65,1,500,798,200,600};
		long n = sum(a);
		System.out.println(n);

	}

}
