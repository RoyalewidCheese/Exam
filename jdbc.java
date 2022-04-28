//Rathul krishnan r
//46

import java.sql.*;

class jdbc {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String pass = "test@123";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "select * from person";
            ResultSet rs = stmt.executeQuery(sql); 
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}