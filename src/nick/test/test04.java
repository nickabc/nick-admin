package nick.test;

import java.util.Arrays;

//排序
public class test04 {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,4};
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,4};
//		bubbleSort(arr);
//		System.out.println(Arrays.toString(arr));
		int[] sort = sort(arr1,arr2);
		System.out.println(Arrays.toString(sort));
		
	}
	
	
	//冒泡排序
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] sort(int[] arr1,int[] arr2){
		int i =0;
		int j =0;
		int k= 0;
		int[] c = new int[arr1.length+arr2.length];
		while(i<arr1.length&&j<arr2.length){
			if(arr1[i]<arr2[j]){
				c[k++]=arr1[i++];
			}else{
				c[k++]=arr2[j++];
			}
		}
		while(i<arr1.length){
			c[k++]=arr1[i++];
		}
		while(j<arr2.length){
			c[k++]=arr2[j++];
		}
		return c;
}
}
