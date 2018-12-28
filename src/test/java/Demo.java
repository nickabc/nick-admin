import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			System.out.println(list);//[1,2,3]
			
			List<Integer> subList = list.subList(0, 2);
			System.out.println(subList);//[1,2]

			subList.add(4);
			System.out.println(subList);//[1,2,4]
			System.out.println(list);//[1,2,4,3]

	}

}
