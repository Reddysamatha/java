import java.util.Scanner;
public class FirstNonReaptedCharacters {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
            String str=s.nextLine();
           System.out.println(str.length());
          int max=0,count=1;
   for(int i=0;i<str.length();i++)
   {
	    str.charAt(i);
    }
      for(int i=0;i<str.length();i++)
      {
	          for(int j=i+1;j<str.length();j++)
	       {
	        	  System.out.println(str.charAt(i)+"-"+str.charAt(j));
	           	if(str.charAt(i)==str.charAt(j))
		       {
		        	count++;
		       }	
	       }
	          if(count==1)
	          {
	        	 System.out.println("char:"+str.charAt(i)+count); 
	        	 break;
	          }
	          count=1;
      }
	  }
  

	}


