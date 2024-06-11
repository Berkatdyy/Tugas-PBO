package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDbarang {

    public void createBarang(String kode_barang, String id_jns_barang, String nama_barang, double harga, int stok_barang, String id_pemasok_barang, String id_karyawan_input, String tlg_posting) {
        String sql = "INSERT INTO data_barang (kode_barang, id_jns_barang, nama_barang, harga, stok_barang, id_pemasok_barang, id_karyawan_input, tlg_posting) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kode_barang);
            pstmt.setString(2, id_jns_barang);
            pstmt.setString(3, nama_barang);
            pstmt.setDouble(4, harga);
            pstmt.setInt(5, stok_barang);
            pstmt.setString(6, id_pemasok_barang);
            pstmt.setString(7, id_karyawan_input);
            pstmt.setString(8, tlg_posting);
            pstmt.executeUpdate();

            System.out.println("Barang berhasil ditambahkan.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readBarangs() {
        String sql = "SELECT * FROM data_barang";

        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String kode_barang = rs.getString("kode_barang");
                String id_jns_barang = rs.getString("id_jns_barang");
                String nama_barang = rs.getString("nama_barang");
                double harga = rs.getDouble("harga");
                int stok_barang = rs.getInt("stok_barang");
                String id_pemasok_barang = rs.getString("id_pemasok_barang");
                String id_karyawan_input = rs.getString("id_karyawan_input");
                String tlg_posting = rs.getString("tlg_posting");

                System.out.println(kode_barang + "\t" + id_jns_barang + "\t" + nama_barang + "\t" + harga + "\t" + stok_barang + "\t" + id_pemasok_barang + "\t" + id_karyawan_input + "\t" + tlg_posting);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateBarang(String kode_barang, String id_jns_barang, String nama_barang, double harga, int stok_barang, String id_pemasok_barang, String id_karyawan_input, String tlg_posting) {
        String sql = "UPDATE data_barang SET id_jns_barang = ?, nama_barang = ?, harga = ?, stok_barang = ?, id_pemasok_barang = ?, id_karyawan_input = ?, tlg_posting = ? WHERE kode_barang = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, id_jns_barang);
            pstmt.setString(2, nama_barang);
            pstmt.setDouble(3, harga);
            pstmt.setInt(4, stok_barang);
            pstmt.setString(5, id_pemasok_barang);
            pstmt.setString(6, id_karyawan_input);
            pstmt.setString(7, tlg_posting);
            pstmt.setString(8, kode_barang);
            pstmt.executeUpdate();

            System.out.println("Barang berhasil diupdate.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteBarang(String kode_barang) {
        String sql = "DELETE FROM data_barang WHERE kode_barang = ?";

        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, kode_barang);
            pstmt.executeUpdate();

            System.out.println("Barang berhasil dihapus.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}