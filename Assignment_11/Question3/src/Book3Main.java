import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Book3Main {

	public static void main(String[] args) {
	
		
		
		Set<Book3> set=new TreeSet<Book3>();
		set.add(new Book3("1",23.34,"anshu",2));
		set.add(new Book3("2",2.34,"ojaswi",5));
		set.add(new Book3("3",3.34,"prerna",4));
		set.add(new Book3("4",24.34,"sonam",1));
		set.add(new Book3("5",21.34,"apooo",2));
		set.add(new Book3("3",3.34,"prerna",4));
		set.add(new Book3("4",24.34,"sonam",1));
		set.add(new Book3("5",21.34,"apooo",2));
//		set.add(new Book(null,3.34,"prerna",4));
//		set.add(new Book(null,24.34,"sonam",1));
//		set.add(new Book(null,21.34,"apooo",2));
		Iterator<Book3>  itr=set.iterator();
		while(itr.hasNext()) {
			Book3 b=itr.next();
			System.out.println(b);
		}

		
		
		
		
	}

}
