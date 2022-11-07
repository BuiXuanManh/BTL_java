package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.PhieuKham;

public class PhieuKhamDao {
	public List<PhieuKham> getBN() throws Exception {
        String sql = "select * from PhieuKham";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<PhieuKham> list = new ArrayList<>();
                while (rs.next()) {
                    PhieuKham cl = new PhieuKham(rs.getString("maPhieu"),rs.getString("maBS"),rs.getString("maBN"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
