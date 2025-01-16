package Jar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Sqljdbc {
    public static void main(String[] args) {
        Connection con = null;
        Statement smt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","4253");
            System.out.println(con);
            smt = con.createStatement();
            System.out.println(smt);
            String []sql={"insert into mark values(4,\"Arjun\",97)","insert into mark values(5,\"kavin \",97)","insert into mark values(6,\"Joyboy\",98)"};
            for (int i = 0; i < sql.length; i++) {
                int h = smt.executeUpdate(sql[i]);
                System.out.println(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (con!=null){
                    con.close();
                }if (smt!=null){
                    smt.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}