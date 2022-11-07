package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.ToaThuoc;

public class ToaThuocDao {
	public List<ToaThuoc> getBN() throws Exception {
        String sql = "select * from ToaThuoc";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<ToaThuoc> list = new ArrayList<>();
                while (rs.next()) {
                    ToaThuoc cl = new ToaThuoc(rs.getString("maToa"),rs.getString("loaiThuoc"),rs.getString("loaiBenh"),rs.getString("maBS"),rs.getString("maNV"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
