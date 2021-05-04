package cp213;

public class ProdObj {

	public String Jtag;
	public double Jprice;
	public int Jamount;

	public ProdObj(String Jtag, double Jprice, int Jamount) {
		this.Jprice = Jprice;
		this.Jtag = Jtag;
		this.Jamount = Jamount;
	}

	public String getTag() {
		return this.Jtag;
	}

	public double getPrice() {
		return this.Jprice;
	}

	public int getQuantity() {
		return this.Jamount;
	}

}
