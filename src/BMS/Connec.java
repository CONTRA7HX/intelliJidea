package BMS;
import java.sql.*;
public class Connec

{
    Connection c;
    Statement  s;
    public Connec()
    {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///BMS","root","nikhilsantore");
            s = c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
