package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementDemo{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javafullstack", "root", "root");
		CallableStatement callablestatement=con.prepareCall("call getData()");
        ResultSet rs=callablestatement.executeQuery();
        while(rs.next())
        {
        	System.out.println(rs.getString(1));
        }
        
        CallableStatement call=con.prepareCall("call InsertData()");
        call.executeUpdate();
        System.out.println("1 row inserted");
	}

}
