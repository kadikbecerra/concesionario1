package conectorbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MysqlConexion {
	
	public static Connection getConexion(){
		
		
		Connection con=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost/registro";
			String usr="root";
			String passwd="msql";
			
			con=DriverManager.getConnection(url, usr, passwd);
			
		}catch(ClassNotFoundException e){
			
			System.out.println("fallo  cargar driver");
			 e.printStackTrace();
			
		}catch(SQLException e){
			
			System.out.println("fallo  la bd");
			e.printStackTrace();
			
		}
		
		return con;
		
		
	}

}
