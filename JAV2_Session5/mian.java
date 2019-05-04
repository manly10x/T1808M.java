package JAV2_Session5;
import java.sql.*;

public class mian {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL ="jdbc:mysql://localhost:3306/t1808m";
            Connection conn= DriverManager.getConnection(URL,"NGuyenTruongadmin","anhtruong01");
            Statement statement =conn.createStatement();
            String insert_sql="INSERT INTO student (id,name,age,mark)"+ "VALUES(12133,'Ha Van Long',12,10)";
            String updatee="UPDATE student set name='truong nguyen' WHERE id=12133";
            String deletee="DELETE from student WHERE id=1215445321 ";
            statement.executeUpdate(deletee);

            String sql="SELECT* FROM student";
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                System.out.println("id : "+rs.getString("id"));
                System.out.println("name : "+rs.getString("name"));
                System.out.println("age : "+rs.getString("age"));
                System.out.println("mark"+rs.getString("mark"));

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}