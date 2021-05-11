package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Prepare_Update {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		int id,count;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id:");
		id=sc.nextInt();
		System.out.println("Enter emp Name:");
		name=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		String query="update emp set name=? where id=?";
		PreparedStatement preparedStatement=con.prepareStatement(query);
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, name);
		count=preparedStatement.executeUpdate();
		System.out.println(count+" rows affected");

	}

}
