import java.sql.*;

public class HotelDBTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hotel_db";
        String user = "root";
        String password = "rootpassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to MySQL!");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Guests");
            while (rs.next()) {
                System.out.println(rs.getInt("guest_id") + " - " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
