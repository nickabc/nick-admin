package nick.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//list,set,map
public class test05 {
	public static void main(String[] args) {
		test05 t = new test05();
		//List
		List<Student> list = new ArrayList<Student>();
		//增
//		list.add(1);//[1]
//		list.add(2);//[1,2]
//		list.add(3);//[1,2,3]
//		//删
//		Integer remove = list.remove(0);//1
//		//查1
//		for (int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		//查2
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
//		//查3
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()){
//			Integer i = it.next();
//			System.out.println(i);
//		}
		//list排序
		list.add(new Student("李白",28,98));
		list.add(new Student("花木兰",22,95));
		list.add(new Student("项羽",32,92));
		List<Student> sortList = t.sortList(list);
		System.out.println(list);
		//Set
		Set<String> set = new HashSet<String>();
		//增
		set.add("a");
		set.add("b");
		set.add("c");
		//删
		boolean remove2 = set.remove("d");//false
		//查1
		for (String string : set) {
			System.out.println(string);
		}
		//查2
		Iterator<String> it2 = set.iterator();
		while(it2.hasNext()){
			String string = it2.next();
			System.out.println(string);
		}
		
		
		
		//Map
		Map<String,Integer> map = new HashMap<String,Integer>();
		//增
		map.put("a", 97);
		map.put("A", 65);
		//删
		//map.remove("a");
		//查1
		Set<String> key = map.keySet();
		for (String string : key) {
			System.out.println(string);
			System.out.println(map.get(string));
		}
		//查2
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
	
	//对List进行排序
	public List<Student> sortList(List list){
		Collections.sort(list,new Comparator<Student>(){
			@Override
			public int compare(Student student1, Student student2) {
				int i = student1.getAge()-student2.getAge();
				if(i==0){
					i=student1.getScore()-student2.getScore();
				}
				return i;
			}
			
		});
		return list;
	}

}
