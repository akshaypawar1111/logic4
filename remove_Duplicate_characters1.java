package logical_programe4;

public class remove_Duplicate_characters1 
{
public static void main(String[] args) {
	
	
	
	String s= "akshaypawar";
	
	StringBuilder s1 = new StringBuilder();
	
	for(int i=0; i<s.length();i++)
	{
		
		char c = s.charAt(i);
		
		int j = s.indexOf(c, i+1);
		
		if(i==-1)
		{
			
			 s1.append(c);
			
		}
		System.out.print(s1);
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
