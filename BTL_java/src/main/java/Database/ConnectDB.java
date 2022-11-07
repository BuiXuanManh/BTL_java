package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private static ConnectDB instance;
	private Connection con;

	private ConnectDB() {
		String url = "jdbc:sqlserver://localhost:1433;database=PhongKham;encrypt=true;trustServerCertificate=true;";
		String user = "sa";
		String pass = "sapassword";
		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi that bai !!!!");
		}
	}

	public synchronized static ConnectDB getInstance() {
		if (instance == null)
			instance = new ConnectDB();
		return instance;
	}

	public Connection getConnection() {
		return con;
	}
}
