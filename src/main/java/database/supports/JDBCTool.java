package database.supports;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTool {

    public static Connection getConnection(String url, String dbname, String username, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"+url+"/"+dbname+"?serverTimezone=Asia/Shanghai", username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //TODO Question 1 Check user name and password
    public static Connection getConnection() {
        return JDBCTool.getConnection("localhost:3306", "groupwork", "root", "");
    }

}
