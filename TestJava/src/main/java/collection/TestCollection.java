package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * javaÖ®Collection½Ó¿Ú
 */
public class TestCollection {

	public static void main(String[] args) {
	    Collection<Object> c = new ArrayList<Object>();
	    c.add("hello");
	    c.add(new Integer(100));
	    System.out.println(c.size());
	    System.out.println(c);
	    
	    Collection<Object> c2 = new HashSet<Object>();
	    c2.add("hello");
	    c2.add(new Integer(100));
	    c2.remove("hello");
	    System.out.println(c2);
	    
	    Collection<Object> c3 = new LinkedList<Object>();
	    c3.add("hello");
	    System.out.println(c3.contains("hello"));
	    
	    Collection<Object> c4 = new HashSet<Object>();
	    c4.add("hello");
	    c4.add("java");
	    c4.add("world");
	    Iterator<Object> i = c4.iterator();
	    while(i.hasNext()){
	      String str = (String)i.next();
	      System.out.print(str+" ");
	    }
	    for(Iterator<Object> it = c4.iterator(); it.hasNext();){
	      String str = (String)it.next();
	      if(str.equals("java"))it.remove();
	    }
	    System.out.println(c4);
	}

}
