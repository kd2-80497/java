import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Questiion4 {

	public static void main(String[] args) {
		
		
//		Collection<String> c= new ArrayList<>();
//		Collection<String> c= new HashSet<>(); //sorted
Collection<String> c = new TreeSet<>();
//		Collection<String> c = new LinkedHashSet<>();//insert
		c.add("A");
		c.add("B");
		c.add("c");
		c.add("d");
		c.add("b");
		c.add("b");
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
