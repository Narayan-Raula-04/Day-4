import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class JdbcCrudOperation {
    private static String url = "jdbc:postgresql://localhost:5432/college";
    private static String username = "postgres";
    private static String password = "123";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.err.println("yes driver loaded");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println(con);

            String sql = "insert into demo1(id,name,age) values(?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, 101);
            pstm.setString(2, "Narayan");
            pstm.setInt(3, 21);
            pstm.executeUpdate();

            String sql1 = "update demo1 set name=?,age=? where id=?";
            PreparedStatement pstm1 = con.prepareStatement(sql1);
            pstm1.setString(1, "Sahil");
            pstm1.setInt(2, 25);
            pstm1.setInt(3, 101);
            pstm1.executeUpdate();

            String sql2 = "delete from demo1 where id=?";
            PreparedStatement pstm2 = con.prepareStatement(sql2);
            pstm2.setInt(1, 101);
            pstm2.executeUpdate();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
