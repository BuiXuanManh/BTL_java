package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import entity.NhanVien;

public class NhanVienDao {
	public List<NhanVien> getBN() throws Exception {
        String sql = "select * from NhanVien";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<NhanVien> list = new ArrayList<>();
                while (rs.next()) {
                    NhanVien cl = new NhanVien(rs.getString("maNV"),rs.getString("tenNV"),rs.getString("nghiepVu"),rs.getString("maTk"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
