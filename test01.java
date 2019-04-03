
public class Test01 {

	public static void main(String[] args) {
	/**
	 * 编写代码，101-200之间有多少个素数，并输出所有素数
	 */
    int num=0;
	for(int i=101;i<=200;i++){
		boolean flag=true;
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			num++;
			System.out.println(i);
		}
	}
	  System.out.println("一共有素数："+num);	

	}

}
