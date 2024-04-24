package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiMysql {

    private Connection connect;
    private String driverName = "com.mysql.cj.jdbc.Driver"; // Driver MySQL Connector/J
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost"; // IP atau domain untuk server MySQL
    private String port = "3306"; // Port default untuk MySQL
    private String database = "crud2220702364"; // Database yang akan digunakan
    private String url = jdbc + host + ":" + port + "/" + database + "?useSSL=false"; // URL JDBC lengkap dengan opsi
    private String username = "root"; // Nama pengguna MySQL
    private String password = ""; // Kata sandi MySQL

    public Connection getKoneksi() throws SQLException {
        if (connect == null) {
            try {
                Class.forName(driverName);
                System.out.println("Class Driver Ditemukan");
                try {
                    connect = DriverManager.getConnection(url, username, password);
                    System.out.println("Koneksi Database Sukses");
                } catch (SQLException se) {
                    System.out.println("Koneksi Database Gagal: " + se.getMessage());
                    System.exit(0);
                }
            } catch (ClassNotFoundException cnfe) {
                System.out.println("Class Driver Tidak Ditemukan: " + cnfe.getMessage());
                System.exit(0);
            }
        }
        return connect;
    }
}
