import java.util.Scanner;

public class Test02 {
 
	public static void main(String[] args) {
		/**
		 * 给定任意一个数字，请使用代码将数字倒序输出。（两种方式）
		 */
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		DaoXu01(number);
		System.out.println();
		DaoXu02(number);

	}
	
	 public static void DaoXu01(int number) {
		String string=""+number;
		char []arr=string.toCharArray();
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
	}
	
     public static void DaoXu02(int number) {
		while(number!=0) {
			System.out.print(number%10);
			number/=10;
		}
	}

}
