package entity;

import java.sql.Date;

public class XetNghiem {
	private String maXN;
	private String huyetAp;
	private String XNNuocTieu;
	private String chuanDoan;
	private String maBS;
	private String maBN;
	private Date ngayXN;
	public String getMaXN() {
		return maXN;
	}
	public void setMaXN(String maXN) {
		this.maXN = maXN;
	}
	public String getHuyetAp() {
		return huyetAp;
	}
	public void setHuyetAp(String huyetAp) {
		this.huyetAp = huyetAp;
	}
	public String getXNNuocTieu() {
		return XNNuocTieu;
	}
	public void setXNNuocTieu(String xNNuocTieu) {
		XNNuocTieu = xNNuocTieu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public String getMaBS() {
		return maBS;
	}
	public void setMaBS(String maBS) {
		this.maBS = maBS;
	}
	public String getMaBN() {
		return maBN;
	}
	public void setMaBN(String maBN) {
		this.maBN = maBN;
	}
	public XetNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getNgayXN() {
		return ngayXN;
	}
	public void setNgayXN(Date ngayXN) {
		this.ngayXN = ngayXN;
	}
	public XetNghiem(String maXN, String huyetAp, String xNNuocTieu, String chuanDoan,Date ngayXN, String maBS, String maBN
			) {
		super();
		this.maXN = maXN;
		this.huyetAp = huyetAp;
		XNNuocTieu = xNNuocTieu;
		this.chuanDoan = chuanDoan;
		this.maBS = maBS;
		this.maBN = maBN;
		this.ngayXN = ngayXN;
	}
	@Override
	public String toString() {
		return "XetNghiem [maXN=" + maXN + ", huyetAp=" + huyetAp + ", XNNuocTieu=" + XNNuocTieu + ", chuanDoan="
				+ chuanDoan + ", maBS=" + maBS + ", maBN=" + maBN + ", ngayXN=" + ngayXN + "]";
	}
}
