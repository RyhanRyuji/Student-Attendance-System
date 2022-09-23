
import java.sql.*;
public class ConnectDb {
    public static void main(String[] args) {
       
    
        try{
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_test","root","");
        String sqlQuery = "SELECT * FROM car_rental";
        PreparedStatement query = conn.prepareStatement(sqlQuery);
        ResultSet resultSet = query.executeQuery();

        if(resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getString(4));


        }
        }
    catch (Exception exception) {
        System.out.println(exception);
        
    } 
    
}
}
