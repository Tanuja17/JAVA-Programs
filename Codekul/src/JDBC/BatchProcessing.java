package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		String query="insert into emp values(?,?,?)";
		PreparedStatement stmt=con.prepareStatement(query);		
		Scanner sc=new Scanner(System.in);
	
		String name,add;
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter name for "+i+" record");
			name=sc.next();
			System.out.println("Enter Address for "+i+" record");
            add=sc.next();
            stmt.setInt(1, i);
            stmt.setString(2,name);
            stmt.setString(3, add);
            stmt.addBatch();

	}
		stmt.executeBatch();

}
	
}	
