package nick.test;

import java.util.Arrays;

//约瑟夫环
public class Test02 {
	//获得最后一个数的下标
	public int getLastIndex(int len,int step){
		int[] arr = new int[len];
		for(int i=0;i<len;i++){//新建一个数组，下标等于元素本身
			arr[i]=i;
		}
		//System.out.println(Arrays.toString(arr));[0, 1, 2, 3, 4]
		int index = 0;//计数器
		for(int i=2;i<len+1;i++){//删除次数
			index = (index+step+1)%i;//规律公式，i为数据长度
		}
		return index;
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		System.out.println(t.getLastIndex(8,2));
	}
}
