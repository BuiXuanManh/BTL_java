package entity;

public class ToaThuoc {
	private String maToa;
	private String loaiThuoc;
	private String loaiBenh;
	private String maBS;
	private String maNV;
	public String getMaToa() {
		return maToa;
	}
	public void setMaToa(String maToa) {
		this.maToa = maToa;
	}
	public String getLoaiThuoc() {
		return loaiThuoc;
	}
	public void setLoaiThuoc(String loaiThuoc) {
		this.loaiThuoc = loaiThuoc;
	}
	public String getLoaiBenh() {
		return loaiBenh;
	}
	public void setLoaiBenh(String loaiBenh) {
		this.loaiBenh = loaiBenh;
	}
	public String getMaBS() {
		return maBS;
	}
	public void setMaBS(String maBS) {
		this.maBS = maBS;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public ToaThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToaThuoc(String maToa, String loaiThuoc, String loaiBenh, String maBS, String maNV) {
		super();
		this.maToa = maToa;
		this.loaiThuoc = loaiThuoc;
		this.loaiBenh = loaiBenh;
		this.maBS = maBS;
		this.maNV = maNV;
	}
	@Override
	public String toString() {
		return "ToaThuoc [maToa=" + maToa + ", loaiThuoc=" + loaiThuoc + ", loaiBenh=" + loaiBenh + ", maBS=" + maBS
				+ ", maNV=" + maNV + "]";
	}
	
}
