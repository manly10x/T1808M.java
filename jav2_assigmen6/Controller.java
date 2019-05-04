package jav2_assigmen6;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    public TextField id;
    public TextField username;
    public TextField email;
    public TextField password;
    public TextField status;
    public TextArea print;



    public class Connector {
        public Connection conect;
        public void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String URL="jdbc:mysql://locahost:8888/t1808m";
                this.conect= DriverManager.getConnection(URL,"NGuyenTruongadmin","anhtruong01");
            }catch (Exception e ){
                e.printStackTrace();
            }
        }
        public ResultSet getQuery(String sql) throws Exception{
            Statement sttm=conect.createStatement();
            return sttm.executeQuery(sql);
        }
        public Integer updateQuery(String sql)throws Exception{
            Statement sttm=conect.createStatement();
            return sttm.executeUpdate(sql);
        }
    }
    public void register() throws Exception{


    }

    public void button(Connection conect) throws Exception {
        String x=id.getText();
        String y=status.getText();
        String z=username.getText();
        String g=password.getText();
        String h=email.getText();
        Statement sttm = conect.createStatement();
        String insert_sql="INSERT INTO user(id,username,email,password,status) VALUES" +
                "('"+x+"','"+z+"','"+h+"','"+g+"','"+y+"')";

        sttm.executeUpdate(insert_sql);
        print.setText("Đăng kí thành công");
    };

}