package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.BenhNhan;

public class BenhNhanDao {
	public List<BenhNhan> getBN() throws Exception {
        String sql = "select * from BenhNhan";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<BenhNhan> list = new ArrayList<>();
                while (rs.next()) {
                    BenhNhan cl = new BenhNhan(rs.getString("maBN"),rs.getString("tenBN"),rs.getString("gioiTinh"),rs.getString("SDT"),rs.getString("cmnd"),rs.getString("canbenh"),rs.getString("tinhTrang"),rs.getDate("thoigiankham"),rs.getString("maTk"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
