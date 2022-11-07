package entity;

public class PhieuKham {
	private String maPhieu;
	private String maBS;
	private String maBN;
	
	public PhieuKham() {}

	public PhieuKham(String maPhieu, String maBS, String maBN) {
		super();
		this.maPhieu = maPhieu;
		this.maBS = maBS;
		this.maBN = maBN;
	}

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
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

	@Override
	public String toString() {
		return "PhieuKham [maPhieu=" + maPhieu + ", maBS=" + maBS + ", maBN=" + maBN + "]";
	}
}
