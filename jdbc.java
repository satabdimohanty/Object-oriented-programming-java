import java.sql.*;
public class jdbc {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db","root","Jiban@123");
            System.out.println("Connected.");
            Statement st = con.createStatement();
            st.executeUpdate("create table run(data int)");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
}
