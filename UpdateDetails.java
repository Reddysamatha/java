package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDetails
{
 public static void update() 
 {
	 String name,email;
	 System.out.println("enter student name to update");
	 Scanner s=new Scanner(System.in);
	 name = s.next();
	 System.out.println("enter marks to update");
	 int marks = s.nextInt();
	 System.out.println("enter email to update");
	 email=s.next();
	 try {
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","samatha");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("update students set marks='"+marks+"',email='"+email+"' where name='"+name+"'");
		
	} 
	 catch (Exception e) 
	 {
		System.out.println(e);
	}
		
	 
 }
	public static void main(String[] args)
	{
      UpdateDetails t=new UpdateDetails();
      t.update();

	}

}
