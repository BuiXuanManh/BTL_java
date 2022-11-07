package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.BacSi;
public class BacSidDao {
	public List<BacSi> finAll() throws Exception {
        String sql = "select * from BacSi";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<BacSi> list = new ArrayList<>();
                while (rs.next()) {
                    BacSi cl = new BacSi();
                    cl.setMaBS("maBS");
                    cl.setTenBS("tenBS");
                    cl.setSoDT("SDT");
                    cl.setMaTk("maTk");
                    list.add(cl);
                }
                return list;
            }
        }
    }
}
