import java.sql.*;

public class databasetest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String dburl ="jdbc:mysql://127.0.0.1:3306/mynewschema";

        String username= "shinde.ramya@gmail.com";
        String password="Radhey@13";

        String  query = "select * from mynewschema.employee";

        Class.forName("com.mysql.cj.jdbc.Driver");


        Connection con = DriverManager.getConnection(dburl,username,password);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()){
            String myid= rs.getString(1);
            System.out.println(myid + " ");
        }

        con.close();

    }
}
