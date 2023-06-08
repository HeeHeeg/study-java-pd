package repository;

import config.JdbcConnection;
import domain.entity.Me;
import domain.dto.SignupDto;

import java.sql.*;

public class UserRepository {
    public static Me me;
    public boolean login(String id, String password) {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "select * from users" +
                " where username = ? and password = ?";
        Integer id1 = null;
        String name= null;
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);  // 첫번째 물음표에 아이디를 넣겠다. 두번째 물음표에 패스워드를 넣겠다.
            psmt.setString(2, password);
            ResultSet resultSet = psmt.executeQuery();
            while (resultSet.next()) {
               id1 =  resultSet.getInt("id");
               name =  resultSet.getString("name");
                me = new Me(id1, name);
                System.out.println(id1 + " " + name + " 환영해요");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            conn.close();
        } catch (SQLException e) { // 여기에 있던 스로우를 지워서 던지지 않고(프로그램을 멈추지 않고) 계속 하겠다. 해서 아래 왜 오류가 뜨는지 나오게 한거다.
            System.out.println("connection close fail");
        }
        return  id1 != null;
    }

    public void insertUsers(SignupDto dto) {
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "insert into users(username, password, name)\n" +
                "values (?, ?, ?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getUsername());  // 첫번째 물음표에 아이디를 넣겠다. 두번째 물음표에 패스워드를 넣겠다.
            psmt.setString(2, dto.getPassword());
            psmt.setString(3, dto.getName());
            if (psmt.executeUpdate() ==0) {
                System.out.println("insertUsers err"); // 예외처리 한번 해준것이다. 혹시몰라서
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            conn.close();
        } catch (SQLException e) { // 여기에 있던 스로우를 지워서 던지지 않고(프로그램을 멈추지 않고) 계속 하겠다. 해서 아래 왜 오류가 뜨는지 나오게 한거다.
            System.out.println("connection close fail");
        }
    }
}
