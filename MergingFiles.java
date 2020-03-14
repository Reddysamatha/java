package samatha;
import java.io.FileWriter;
import java.io.FileReader;
public class MergingFiles 
{
	public void Merge()
	{
		int i=0,j=0;
		try {
			FileReader fr=new FileReader("D://samatha/bbb.txt");
			FileReader fre=new FileReader("D://samatha/ccc.txt");
			FileWriter freq=new FileWriter("D://samatha/ddd.txt",true);
					while((i=fr.read())!=-1)
					{
						freq.write(i);			
					}
					while((j=fre.read())!=-1)
					{
						freq.write(j);
					}
					freq.flush();
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
	public static void main(String[] args) {
		
		MergingFiles obj=new MergingFiles();
		obj.Merge();
	}

}
