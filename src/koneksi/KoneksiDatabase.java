
package koneksi;

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
        Connection cn;
        public static Connection bukaKoneksi(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/latihanjavacrud", "root","");
                return cn;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
            
            }
        
        }
    
}
