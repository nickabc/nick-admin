package nick.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
public class test08 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("李白",22,80));
		list.add(new Student("后裔",32,70));
		list.add(new Student("韩信",26,75));
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}
			
		});
		System.out.println(list);
	}

}
