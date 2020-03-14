import java.util.Scanner;
public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
            String str=s.nextLine();
           System.out.println(str.length());
          int max=0,count=1;
        char result=' ';
   for(int i=0;i<str.length();i++)
   {
	    str.charAt(i);
    }
      for(int i=0;i<str.length();i++)
      {
	          for(int j=i+1;j<str.length();j++)
	       {
	           	if(str.charAt(i)==str.charAt(j))
		       {
		        	count++;
		       }	
	       }
	          if(count>1)
	          {
	        	 System.out.println("char:"+str.charAt(i)+count); 
	          }
	          count=1;
      }

	  }
  }
