package samatha;
import java.io.File;
import java.io.FileReader;
public class ReadingFile {
			public static void main(String args[])
			{
		        try {  
				FileReader fr=new FileReader("D://samatha/aaa.txt");
				int i=0;
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
				
		        }
		        catch(Exception e)
		        {
		        	System.out.println(e);
		        }
			}

		}
