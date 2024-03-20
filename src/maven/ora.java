package maven;

import java.sql.*;

public class ora {



			public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
				 Class.forName("oracle.jdbc.driver.OracleDriver");  
		         Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");  
		         Statement statement = connection.createStatement();  
		         
		         int resultset = statement.executeUpdate(" insert  into ban values(3)"); 
		         
		connection.close();

		System.out.println("values are inserted");
			}

		}

	


