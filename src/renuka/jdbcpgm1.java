package renuka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.preparedstatement;
import 

public class jdbcpgm1 
{
	public static void main(String args[])
	{
		try
		{
			class.forName("com.mysql.cj.jdbc.Driver");
			Connection Conn=Driver manager.get connection(url,usernmae,password);
			Scanner scr =new scanner(System.in);
			String sql ="create database"+src.Next();
			preparedstatsment smt=Conn.preparestatment();
			int i=pmst.excute update();
			if(i>0)
			{
				System.out.println("database created");
			}
			else
			{
				system.out.println("database not created");
			
			}
			
		pmst.close();
		Conn.close();
		src.close();
		}
		catch(exception e);
		{
			System.out.println(e);
		}
		
	}
}
