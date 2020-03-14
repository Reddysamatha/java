import java.util.Scanner;
public class LongestWord {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
         String str=s.nextLine();
         //System.out.println(str.length());
        String word[]=str.split(" ");
        String lon="";
     for(int i=0;i<word.length;i++)
     {
    	 if(lon.length()<=word[i].length())
    	 {
    		 lon=word[i];
    	 }
     }
     System.out.println("longest:"+lon);

	}
}