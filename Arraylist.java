package moduleone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
public class Arraylist {

	public static void main(String[] args) {
		 ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(a1);
System.out.println(a1.size());
System.out.println(a1.contains(20));
System.out.println(a1.get(2));
Iterator<Integer> i1 = a1.iterator();
           while (i1.hasNext()) {
        	   int i2 =i1.next();
        	   if(i1.next() > 30) {i1.remove();}
           }
          System.out.println(a1);
          
          ListIterator<Integer> l1 = a1.listIterator();
          while (l1.hasPrevious()) {
        	  System.out.println(l1.previous());
        	  if(l1.previous()> 20) {
        		  l1.remove();
        	  }
          }
          System.out.println(a1);
	}
}

