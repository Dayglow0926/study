package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class studyConnectionMaker implements SimpleConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/study?characterEncoding=UTF-8&serverTimezone=UTC", "root", "1234");
    }
}
