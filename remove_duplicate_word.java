package logical_programe4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate_word 
{
public static void main(String[] args) {
	
	
	String a ="akshay is a very very tall boy";
	
	String[] b = a.split(" ");
	
	
	Set<String> s = new LinkedHashSet<>();
	
	  for(String zz:s)
	  {
		  
		  s.add(zz);
		  
	  }
	
	Iterator<String> v = s.iterator();
	
	while(v.hasNext())
	{
		
		System.out.print(v.next());
	}
}
}
