import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class BookMain {

	public static void main(String[] args) {
		Set<Book> set=new LinkedHashSet<Book>();
		set.add(new Book("1",23.34,"anshu",2));
		set.add(new Book("2",2.34,"ojaswi",5));
		set.add(new Book("3",3.34,"prerna",4));
		set.add(new Book("4",24.34,"sonam",1));
		set.add(new Book("5",21.34,"apooo",2));
		set.add(new Book("3",3.34,"prerna",4));
		set.add(new Book("4",24.34,"sonam",1));
		set.add(new Book("5",21.34,"apooo",2));
//		set.add(new Book(null,3.34,"prerna",4));
//		set.add(new Book(null,24.34,"sonam",1));
//		set.add(new Book(null,21.34,"apooo",2));
		Iterator<Book>  itr=set.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
		// TODO Auto-generated method stub

	}

}
