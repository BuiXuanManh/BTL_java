package entity;

public class TaiKhoan {
	private int maTk ;
	private String tenTK;
	private String matKhau;
	private String vaiTro;
	
	public TaiKhoan() {}

	public TaiKhoan(int maTk, String tenTK, String matKhau, String vaiTro) {
		super();
		this.maTk = maTk;
		this.tenTK = tenTK;
		this.matKhau = matKhau;
		this.vaiTro = vaiTro;
	}

	public int getMaTk() {
		return maTk;
	}

	public void setMaTk(int maTk) {
		this.maTk = maTk;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(String vaiTro) {
		this.vaiTro = vaiTro;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTk=" + maTk + ", tenTK=" + tenTK + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + "]";
	}
}
