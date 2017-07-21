package assignment9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Assignment9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//defining  Generic HashMap hm with Empcode and Empname
		HashMap<Integer,String> hm = new HashMap<Integer,String>();//Key Empcode is of Integer type ,EMpname of String
		//populating key and values
		hm.put(1, "Gauri");
		hm.put(2, "Aryan");
		hm.put(3, "Suhana");
		hm.put(4, "AbRam");
		//to print the values, first get the keyset() which returns the Setand get the iterator on the same
		Iterator<Integer> keySetIterator = hm.keySet().iterator(); 
		System.out.println( "The  values are : ");
		while(keySetIterator.hasNext())
		{
		    Integer key = keySetIterator.next();
		    System.out.println(  hm.get(key));
		} 
	}

}
