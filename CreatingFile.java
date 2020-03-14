package samatha;
import java.io.File;
import java.io.IOException;
	public class CreatingFile 
	{
		
		public static void main(String[] args)
		{
		  File f=new File("D://samatha/abc.txt");
		  try {
			f.createNewFile();
			
		    } 
		  catch (IOException e) 
		  {
			System.out.println(e);
		}
		}

	}
