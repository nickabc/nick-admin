package nick.test;

import java.util.Arrays;

//数组
public class test03 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {14,13,12,11};
		int[] c =new int[arr1.length+arr2.length];
		copyArray(arr1,0,c,0,arr1.length);
		System.out.println(Arrays.toString(c));
		System.arraycopy(arr2,0, c, arr1.length, arr2.length);
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		//System.out.println(Arrays.toString(f(arr1,6)));
	}
	//数组的复制
	public static void copyArray(int[] arr1,int starIndex,
			int[] arr2,int destIndex,int length){
		System.arraycopy(arr1, starIndex, arr2, destIndex, length);
	}
	
	//数组的扩容
	public static int[] f(int[] arr,int len){
		return Arrays.copyOf(arr, 10);
	}
}
