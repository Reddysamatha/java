package samatha;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class WFile {
	public void readingSentence()
	{
		try {
			FileReader f=new FileReader("D://samatha/bbb.txt");
			int i=0,wc=1,small=0,large=0;
			while((i=f.read())!=-1)
					if(i==' ')
					{
						wc++;
			        }
					else if(i>='a' && i<='z')
					{
						small++;
					}
					else if(i>='A' && i<='z')
					{
						large++;
					}
			System.out.println(wc+":wc");
			System.out.println(small+":small");
			System.out.println(large+":large");
			f.close();
	     	}
		catch(IOException e)
		{
			System.out.println("error");
		}
		
	}
	
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
		catch(IOException e)
		{
			System.out.println("error");
		}
		
	}
	public void viewOptions()
	{
		int opt;
		System.out.println("1.writing sentence");
		System.out.println("2.reading sentence");
		System.out.println("3.line count");
		do {
			Scanner s=new Scanner(System.in);
			System.out.println("enter opt");
			opt=s.nextInt();
			if(opt==1)
			{
				writingSentence();
			}
			if(opt==2)
			{
				readingSentence();
			}
		}
		while(opt!=0);
		
	}
	
	public static void main(String[] args) 
	{
        WFile obj=new WFile();
        obj.viewOptions();
      
	}

}
