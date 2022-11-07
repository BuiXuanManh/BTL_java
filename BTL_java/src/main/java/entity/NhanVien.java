package entity;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private String nghiepVu;
	private String maTk;
	
	public NhanVien() {}
	
	public NhanVien(String maNV, String tenNV, String nghiepVu, String maTk) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.nghiepVu = nghiepVu;
		this.maTk = maTk;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNghiepVu() {
		return nghiepVu;
	}

	public void setNghiepVu(String nghiepVu) {
		this.nghiepVu = nghiepVu;
	}

	public String getMaTk() {
		return maTk;
	}

	public void setMaTk(String maTk) {
		this.maTk = maTk;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", nghiepVu=" + nghiepVu + ", maTk=" + maTk + "]";
	}
}
