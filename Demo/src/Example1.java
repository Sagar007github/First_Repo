import java.util.ArrayList;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Sagar");	
		al.add("Shubhangi");
		al.add("Parag");
		al.add("Pawan");

		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		

	}

}
