import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.swing.tree.RowMapper;

public class comparableAndComparator {
    public static void main(String[] args) {
    	List<Student> s = new ArrayList<Student>();
    	s.add(new Student(19,"anand"));
    	s.add(new Student(18,"vardhan"));
    	s.add(new Student(20,"Virat"));
    	s.add(new Student(19,"Kohli"));
    	Collections.sort(s);
    System.out.println(s);
    List<String> names = Arrays.asList("anand","vardhan");
    Optional<String> name = names.stream().filter(i->i.startsWith("A")).findFirst();
    String name1 = names.stream().filter(i->i.startsWith("A")).findFirst().orElse("Not Found1");
    System.out.println(name.orElse("Not Found"));
    System.out.println(name1);
    int m  = Integer.parseInt(Student.b);
    System.out.println(m);
    
    Comparator<Integer> c =( i ,  j)->  i>j? 1:-1;
	List<Integer> nums = new ArrayList<Integer>();
	nums.add(2);
	nums.add(7);
	nums.add(3);
	nums.add(1);
	nums.sort(c);
	System.out.println(nums);
}
}
class Student implements Comparable<Student> {
	int age;
	String name;
	public static final String b = "0";
public Student() {
		
	}
	public Student(int i, String string) {
		this.age = i;
		this.name = string;
	}
	

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Student s1) {
		
		return this.age > s1.age?1:-1;
	}


	
	
}
