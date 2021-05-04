package cp213;

import java.util.ArrayList;

/**
 * Vending machine model. Contains the algorithms for vending products, handling
 * change and inventory, and working with credit. Should not perform any GUI
 * work of any kind.
 *
 * @author Anshul Khatri
 * @version 2021-03-19
 */
public class VendModel {
	final int PROD_QUANTITY = 5;

	double price;
	double payTotal;
	double change;
	double payed = 3.25;
	boolean validInput;
	boolean quan;

	public double getTotal(ArrayList<ProdObj> prodArr, String tag) {

		validInput = true;
		quan = true;

		for (ProdObj P : prodArr) {
			if (P.getTag().equals(tag)) {
				if (P.getQuantity() == 0) {
					quan = false;
				} else {
					price += P.getPrice();

					P.Jamount -= 1;
				}

				return price;
			}

		}
		validInput = false;
		return price;
	}

	public double getPrice() {
		return this.price;
	}

	public double getPayment(double cash) {

		this.payTotal += cash;
		return payTotal;
	}

	public double payTotal(double totalPay) {

		this.change = 0;
		this.payed += totalPay;

		if (this.price == totalPay) {
			this.price -= totalPay;
		} else if (this.price < totalPay) {
			this.price -= totalPay;

			this.change = Math.abs(this.price);
			this.payed -= this.change;

		}
		this.price = 0;
		this.payTotal = 0;

		return change;

	}

	public void payCard(double totalPay) {
		this.price -= totalPay;
		this.payTotal = 0;

	}

	public void cancelOption(ArrayList<ProdObj> prodArr) {
		this.price = 0;
		this.payTotal = 0;
		for (ProdObj P : prodArr) {
			if (P.getQuantity() < PROD_QUANTITY) {
				P.Jamount = PROD_QUANTITY;
			}
		}
	}

	public void clearPay() {
		this.payTotal = 0;
	}

}
