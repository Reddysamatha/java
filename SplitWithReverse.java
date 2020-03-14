import java.util.Scanner;
public class SplitWithReverse
{

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter string");
	         String str=s.nextLine();
	    System.out.println(str.length());
	    String word[]=str.split(" ");
	     for(int i=word.length-1;i>=0;i--)
	     {
	    	 System.out.print(word[i]);
	     }

		}

}



