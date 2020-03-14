package samatha;
import java.io.File;
import java.io.FileWriter;
public class WritingFile {
		
		public static void main(String args[])
		{
			File f=new File("D://samatha/aaa.txt");
			try {
	        FileWriter fw=new FileWriter(f);
	        fw.write("hai");
	        fw.write("A");
	        fw.write(100);
	        fw.flush();
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}

      }
