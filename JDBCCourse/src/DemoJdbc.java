import java.sql.*;
public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        int sid=5;
        String sname="shanti";
        int marks=2000;
        String url="jdbc:postgresql://localhost:5432/demo";
        String uname="postgres";
        String pass="password";
        String sqlInsert="INSERT INTO Student VALUES (?,?,?)";
        Connection connection= DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");
        PreparedStatement stmt=connection.prepareStatement(sqlInsert);
        stmt.setInt(1,sid);
        stmt.setString(2,sname);
        stmt.setInt(3,marks);
        stmt.execute();
        connection.close();
        System.out.println("connection closed");


    }
}
