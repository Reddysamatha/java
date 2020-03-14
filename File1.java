package samatha;
import java.io.FileWriter;
import java.util.Scanner;
public class File1 {
	public void writingSentence()
	{
		try
		{
			FileWriter f=new FileWriter("D://samatha/bbb.txt");
			Scanner s=new Scanner(System.in);
			System.out.println("enter string");
			String str=s.nextLine();
			f.write(str);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println("eroor");
		}
	}
	public static void main(String[] args) {
		File1 obj=new File1();
        obj.writingSentence();

	}

}
