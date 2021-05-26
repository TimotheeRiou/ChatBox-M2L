import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
	
	private static String url = "jdbc:mysql://localhost/m2l";
	private static String user = "root";
	private static String passwd = "root";
	private static Connection connect;

	
	public static Connection getInstance(){
		if(connect == null){
		  try {
		    connect = DriverManager.getConnection(url, user, passwd);
		    System.out.println("INSTANCIATION DE LA CONNEXION SQL ! "); //Syso juste pour le test
		  } catch (SQLException e) {
		    e.printStackTrace();
		    
		  }
		}  else System.out.println("NOh SQL"); // Syso juste pour le test
			
		return connect;
	}   
}
