package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.XetNghiem;

public class XetNghiemDao {
	public List<XetNghiem> getBN() throws Exception {
        String sql = "select * from XetNghiem";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<XetNghiem> list = new ArrayList<>();
                while (rs.next()) {
                    XetNghiem cl = new XetNghiem(rs.getString("maXN"),rs.getString("huyetAp"),rs.getString("XNNuocTieu"),rs.getString("chuanDoan"),rs.getDate("ngayXN"),rs.getString("maBS"),rs.getString("maNV"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
