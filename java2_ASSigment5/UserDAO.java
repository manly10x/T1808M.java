package java2_ASSigment5;

import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO implements UserDAOInterface{
    @Override
    public ArrayList<User> getUsers() {
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM user";
        try{
            ResultSet rs = connector.getQuery(sql);
            ArrayList<User> list = new ArrayList<>();
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("status")
                );

                list.add(user);
            }

            return list;

        }catch (Exception e){}

        return null;
    }

    @Override
    public boolean saveUser(User user) {
        try{
            Connector connector = Connector.getInstance();
            String sql = "INSERT INTO user (username,email,password,status) VALUES('" +
                    user.getUsername()+"','"+
                    user.getEmail()+"','"+
                    user.getPassword()+"','"+
                    user.getStatus()+"')";
            if(connector.updateQuery(sql)> 0){
                return  true;
            }
        }catch (Exception e){}

        return false;
    }

    @Override
    public boolean updateUser(User user) {
        try{
            Connector connector = Connector.getInstance();
            String sql = "UPDATE user SET username = '"+user.getUsername()+"', email = '"+user.getEmail()
                    +"', password='"+user.getPassword()+"', status = "+user.getStatus()
                    +" WHERE id="+user.getId();
            if(connector.updateQuery(sql) > 0){
                return  true;
            }
        }catch (Exception e){}
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    public User load(int id){
        Connector connector = Connector.getInstance();
        String sql = "SELECT * FROM user WHERE id="+id;
        try{
            ResultSet rs = connector.getQuery(sql);
            while (rs.next()){
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getInt("status")
                );

                return user;
            }



        }catch (Exception e){}
        return null;
    }
}
