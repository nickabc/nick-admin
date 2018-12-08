package nick.test;
//递归
public class Test01 {
	
	public static void main(String[] args) {
		int s = fid(5);
		int s1 = test(5);
		System.out.println(s+"||"+s1);
	}
	
	
	//1,1,2,3,5,8

	//递归方法
	public static int fid(int n){
		if(n==1||n==2)
			return 1;
		return fid(n-1)+fid(n-2);
	}
	
	//非递归方法
	public static int test(int n){
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<n;i++){
			arr[i] = arr[i-2]+arr[i-1];
		}
		return arr[n-1];
	}
	
}
