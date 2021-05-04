package cp213;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VendProdBtn extends JPanel {

	private VendModel model = null;
	private Viewrack prodView;
	public PaymentWindow paymentFrame = null;

	public final JButton lableA = new JButton("A");
	public final JButton lableB = new JButton("B");
	public final JButton lableC = new JButton("C");
	public final JButton Num0 = new JButton("0");
	public final JButton Num1 = new JButton("1");
	public final JButton Num2 = new JButton("2");
	public final JButton pay = new JButton("Pay");

	private final JButton addBut = new JButton("Add");
	private final JButton canBut = new JButton("Cancel");

	double total;

	JTextField product = new JTextField();
	JTextArea totalPrice = new JTextArea();

	public VendProdBtn(VendModel model) {
		this.model = model;
		this.prodView = new Viewrack(model);
		this.layoutView();
	}

	private void layoutView() {

		this.totalPrice.setEditable(false);

		
		this.setLayout(new GridLayout(2, 0));

		final JPanel buttnGrd = new JPanel();
		final JPanel inputPan = new JPanel();

		//grid layout for product tag and total.
		inputPan.setLayout(new GridLayout(2, 2));

		inputPan.add(new JLabel("Product Tag: "));
		inputPan.add(this.product);
		inputPan.add(new JLabel("Total : "));
		inputPan.add(this.totalPrice);

		//button for product tag 
		buttnGrd.setLayout(new GridLayout(4, 3));
		buttnGrd.add(this.lableA);
		buttnGrd.add(this.lableB);
		buttnGrd.add(this.lableC);
		buttnGrd.add(this.Num0);
		buttnGrd.add(this.Num1);
		buttnGrd.add(this.Num2);
		//button to procede for payment.
		buttnGrd.add(this.pay );

		
		// actions on every button click .
		this.lableA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "A");
			}
		});
		this.lableB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "B");
			}
		});

		this.lableC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "C");
			}
		});

		this.Num0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "0");
			}
		});
		this.Num1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "1");
			}
		});
		this.Num2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				product.setText(product.getText() + "2");
			}
		});

		this.pay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				paymentFrame = new PaymentWindow(model);

			}
		});
		this.addBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				total = model.getTotal(prodView.prodList, product.getText());
				if (model.validInput == false) {
					totalPrice.setText("input is not valid");
				} else if (model.quan == false) {
					totalPrice.setText("product out of stock");
				}

				else {
					DecimalFormat f = new DecimalFormat("0.00");
					String totalStr = f.format(total);
					totalPrice.setText("$" + totalStr);
				}
				product.setText("");
			}
		});
		this.canBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				model.cancelOption(prodView.prodList);
				totalPrice.setText("");

			}
		});

		// adding button to the grid.
		buttnGrd.add(this.addBut);
		buttnGrd.add(this.canBut);

		this.add(inputPan);
		this.add(buttnGrd);
	}

}
