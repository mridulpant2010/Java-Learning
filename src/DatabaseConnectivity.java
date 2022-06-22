
//Class.forName("com.mysql.jdbc.Driver")

import java.sql.*;

public class DatabaseConnectivity {

    public void databaseConnectivity(){
        String url="";
        String userName="";
        String password="";
        try{
            Connection c = DriverManager.getConnection(url,userName,password);
            Statement st = c.createStatement();
            String query = "select * from stl_query";
            ResultSet resultSet = st.executeQuery(query);
            while (resultSet.next()){
                System.out.println();
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
