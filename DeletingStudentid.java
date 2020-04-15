package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeletingStudentid 
{
	public void delete()
	{
		Scanner s=new Scanner(System.in);
		String name=null;
		try
		{
		  Class.forName("org.h2.Driver");
		  Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
		  Statement st=con.createStatement();
		  System.out.println("how many rows do you want to delete");
		  int row=0;
		   row=s.nextInt();
		  System.out.println("enter name");
			name=s.next();
		String sql="delete from students where name='"+name+"'";
		  int i=st.executeUpdate(sql);
		  if(i>0)
		  {
			  System.out.println("row deleted");
		  }
        }
		catch(ClassNotFoundException | SQLException  c)
		{
			System.out.println(c);
		}
	}
	public static void main(String[] args) 
	{
        DeletingStudentid d=new DeletingStudentid();
        d.delete();
	}
}

