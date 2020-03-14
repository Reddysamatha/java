import java.util.Scanner;
public class AllStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
         String str=s.nextLine();
    System.out.println(str.length());
     for(int i=0;i<str.length();i++)
     {
    	 str.charAt(i);
     }
     System.out.println(str.toUpperCase());
     System.out.println(str.toLowerCase());
     System.out.println(str.contains("hai"));
     System.out.println(str.equals("samatha"));
     System.out.println(str.equalsIgnoreCase("Reddy"));
     System.out.println(str.length());
     System.out.println(str.startsWith("hai"));
     System.out.println(str.endsWith("."));
     System.out.println(str.endsWith("thank you"));
     System.out.println(str.substring(4));
     System.out.println(str.substring(3,5));
     System.out.println(str.trim( ));
     
     
	}

}
