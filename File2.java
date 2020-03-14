package samatha;
import java.io.FileWriter;
import java.util.Scanner;
public class File2 {
	public void writingSentence()
	{
		try
		{
			FileWriter f=new FileWriter("D://samatha/ccc.txt");
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
		File2 obj=new File2();
        obj.writingSentence();

	}

}

