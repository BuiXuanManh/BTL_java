package entity;

import java.sql.Date;
import java.time.LocalDate;

public class BenhNhan {
	private String maBN;
	private String tenBN;
	private String gioiTinh;
	private String soDT;
	private String cmnd;
	private String benh;
	private String tinhTrang;
	private Date ngayKham;
	private String maTk;
	
	public BenhNhan() {}

	public BenhNhan(String maBN, String tenBN, String gioiTinh, String soDT, String cmnd, String benh, String tinhTrang,
			Date date, String maTk) {
		super();
		this.maBN = maBN;
		this.tenBN = tenBN;
		this.gioiTinh = gioiTinh;
		this.soDT = soDT;
		this.cmnd = cmnd;
		this.benh = benh;
		this.tinhTrang = tinhTrang;
		this.ngayKham = date;
		this.maTk = maTk;
	}

	public String getMaBN() {
		return maBN;
	}

	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}

	public String getTenBN() {
		return tenBN;
	}

	public void setTenBN(String tenBN) {
		this.tenBN = tenBN;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getBenh() {
		return benh;
	}

	public void setBenh(String benh) {
		this.benh = benh;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public Date getNgayKham() {
		return ngayKham;
	}

	public void setNgayKham(Date ngayKham) {
		this.ngayKham = ngayKham;
	}

	public String getMaTk() {
		return maTk;
	}

	public void setMaTk(String maTk) {
		this.maTk = maTk;
	}

	@Override
	public String toString() {
		return "BenhNhan [maBN=" + maBN + ", tenBN=" + tenBN + ", gioiTinh=" + gioiTinh + ", soDT=" + soDT + ", cmnd="
				+ cmnd + ", benh=" + benh + ", tinhTrang=" + tinhTrang + ", ngayKham=" + ngayKham + ", maTk=" + maTk
				+ "]";
	}
}
