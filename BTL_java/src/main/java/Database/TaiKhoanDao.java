package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.TaiKhoan;

public class TaiKhoanDao {
	public List<TaiKhoan> getTK() throws Exception {
        String sql = "select * from TaiKhoan";

        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            try ( ResultSet rs = stm.executeQuery();) {
                List<TaiKhoan> list = new ArrayList<>();
                while (rs.next()) {
                    TaiKhoan cl = new TaiKhoan(rs.getInt("maTk"),rs.getString("tenTk"),rs.getString("mk"),rs.getString("vaiTro"));
                    list.add(cl);
                }
                return list;
            }
        }
    }
	public TaiKhoan checkLogin(String maTK, String matKhau) throws Exception {
        String sql = "select matKhau, vaiTro from TaiKhoan " + " where maTK=? and matKhau = ?";
        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            stm.setString(1, maTK);
            stm.setString(2, matKhau);
            try ( ResultSet rs = stm.executeQuery();) {
                if (rs.next()) {
                	TaiKhoan cl = new TaiKhoan(rs.getInt("maTk"),rs.getString("tenTk"),rs.getString("mk"),rs.getString("vaiTro"));
                    return cl;
                }
            }
        }
        return null;
    }
	public boolean insert(TaiKhoan nd) throws Exception {
        String sql = "INSERT INTO dbo.TaiKhoan(matKhau,vaiTro)"
                + "values(?,?)";
        try (
                 Connection con =  ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            stm.setString(1, nd.getMatKhau());
            stm.setString(2, nd.getVaiTro());
            
            return stm.executeUpdate() > 0;
        }
    }
	public TaiKhoan finById(String maTK) throws Exception {
        String sql = "select * from TaiKhoan where maTK = ?";
        try (
                 Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
            stm.setString(1, maTK);
            try ( ResultSet rs = stm.executeQuery();) {
                if (rs.next()) {
                	TaiKhoan cl = new TaiKhoan(rs.getInt("maTk"),rs.getString("tenTk"),rs.getString("mk"),rs.getString("vaiTro"));
                    return cl;
                }
            }
            return null;
        }
    }
	 public boolean delete(String maTK) throws Exception {
	        String sql = "delete from TaiKhoan" + " where maTK = ?";
	        try (
	        		Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
	            stm.setString(1, maTK);
	            return stm.executeUpdate() > 0;
	        }
	    }
	 public boolean updateMK(TaiKhoan nd) throws Exception {
	        String sql = "UPDATE dbo.TaiKhoan"
	                + " SET matKhau = ?"
	                + " where maTK = ?";
	        try (
	        		Connection con = ConnectDB.getInstance().getConnection();  PreparedStatement stm = con.prepareStatement(sql);) {
	            stm.setInt(2, nd.getMaTk());
	            stm.setString(1, nd.getMatKhau());
	            return stm.executeUpdate() > 0;
	        }
	    }
}
