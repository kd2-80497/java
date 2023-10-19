import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Book4Main {
	
public static void main(String[] args) {
	
		class BookComparator implements Comparator<Book4>
		{

			@Override
			public int compare(Book4 arg0, Book4 arg1) {
				int diff = -(int)(arg0.getPrice()-arg1.getPrice());
				return diff;
			}
			
		}
		BookComparator bc= new BookComparator();
		TreeSet<Book4> set=new TreeSet<Book4>(bc);
		set.add(new Book4("1",23.34,"anshu",2));
		set.add(new Book4("2",2.34,"ojaswi",5));
		set.add(new Book4("3",3.34,"prerna",4));
		set.add(new Book4("4",24.34,"sonam",1));
		set.add(new Book4("5",21.34,"apooo",2));
		set.add(new Book4("3",3.34,"prerna",4));
		set.add(new Book4("4",24.34,"sonam",1));
		set.add(new Book4("5",21.34,"apooo",2));
//		set.add(new Book(null,3.34,"prerna",4));
//		set.add(new Book(null,24.34,"sonam",1));
//		set.add(new Book(null,21.34,"apooo",2));
		
		Iterator<Book4>  itr=set.iterator();
		while(itr.hasNext()) {
			Book4 b=itr.next();
			System.out.println(b);
		}
System.out.println("***************Descending Iterator **************");
  Iterator<Book4> itr1= set.descendingIterator();
  while(itr1.hasNext()) {
		Book4 b1=itr1.next();
		System.out.println(b1);
	}

}
}