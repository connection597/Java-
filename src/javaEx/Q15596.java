package javaEx;

public class Q15596 {
//���� n���� �־������� n���� ���� ���ϴ� �Լ� �ۼ��Ͻÿ�
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
