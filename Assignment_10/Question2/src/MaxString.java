import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxString {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("anshu");
		list.add("ojas");
		list.add("ameyyyyyyyyyyyy");
		list.add("janvi");
		list.add("ishan");
		for(String l:list) {
			System.out.println(l);
		}
		class StringCompare implements Comparator<String>{

			@Override
			public int compare(String arg0, String arg1) {
			    
				int diff = (arg0.length()-arg1.length());
				
				
				return diff;
			}
			
		}
		
		StringCompare sc= new StringCompare();
	System.out.println("STRING WItH MAXIMUN LENGTH="+Collections.max(list,sc));	;

	}

}

