package java2_ASSigment5;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static final int DEACTIVE = 0;
    public static final int ACTIVE = 1;

    public static void main(String[] args){
        try {
            Connector connector = Connector.getInstance();
            boolean stop = false;
            Scanner scanner = new Scanner(System.in);
            while (!stop){
                System.out.println("Chon chuc nang:");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("3. Xem danh sach");
                System.out.println("4. Xoa user");
                System.out.println("5. Exit");

                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                if(menu >0 && menu<6){
                    switch (menu){
                        case 1: login(connector);break;
                        case 2: //register(conn);break;
                        case 3: break;
                        case 4: delete(connector);break;
                        case 5: stop = true;connector.conn.close();break;
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void login(Connector connector) throws Exception{
        ;
        boolean success = false;
        Scanner scanner = new Scanner(System.in);

        while (!success){
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();

            String sql = "SELECT * FROM user WHERE username = '"+username
                    +"' AND password = '"+password+"'";
            ResultSet rs = connector.getQuery(sql);
            if(rs.next()){
                System.out.println("Dang nhap thanh cong");
                return;
            }
            System.out.println("Dang nhap sai, vui long nhap lai");
        }
    }

    public static void delete(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int id ;
        System.out.println("Nhap ID can xoa:");
        if(scanner.hasNextInt()){
            id = scanner.nextInt();
            String sql = "UPDATE user SET status="+DEACTIVE+" WHERE id="+id;
            //String sql = "DELETE FROM user WHERE id="+id;
            if(connector.updateQuery(sql) > 0){
                System.out.println("Xoa thanh cong");
                return;
            }
            System.out.println("Khong tim duoc user co id = "+id);
            return;
        }
        System.out.println("Nhap khong chinh xac");
    }
}