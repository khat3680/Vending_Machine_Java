package cp213;

import java.awt.FlowLayout;

import javax.swing.JPanel;

/**
 * Handles the GUI portion of the vending machine. May use other GUI classes for
 * individual elements of the vending machine. Should use the VendModel for all
 * control logic.
 *
 * @author your name here
 * @version 2021-03-19
 */
@SuppressWarnings("serial")
public class VendView extends JPanel {

	private VendModel model = null;
	private VendProdBtn btnGrid = null;
	private Viewrack prodView = null;

	// imageIcon object
	public VendView(VendModel model) {
		this.model = model;
		this.btnGrid = new VendProdBtn(this.model);
		this.prodView = new Viewrack(this.model);
		this.layoutView();


	}

	private void layoutView() {
		this.setLayout(new FlowLayout());
		this.add(this.prodView);
		this.add(this.btnGrid);

	}

}
