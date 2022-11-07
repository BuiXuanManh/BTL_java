package entity;

public class BacSi {
	private String maBS;
	private String tenBS;
	private String soDT;
	private String maTk;
	
	public BacSi() {}

	public BacSi(String maBS, String tenBS, String soDT, String maTk) {
		super();
		this.maBS = maBS;
		this.tenBS = tenBS;
		this.soDT = soDT;
		this.maTk = maTk;
	}

	public String getMaBS() {
		return maBS;
	}

	public void setMaBS(String maBS) {
		this.maBS = maBS;
	}

	public String getTenBS() {
		return tenBS;
	}

	public void setTenBS(String tenBS) {
		this.tenBS = tenBS;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getMaTk() {
		return maTk;
	}

	public void setMaTk(String maTk) {
		this.maTk = maTk;
	}

	@Override
	public String toString() {
		return "BacSi [maBS=" + maBS + ", tenBS=" + tenBS + ", soDT=" + soDT + ", maTk=" + maTk + "]";
	}
}
