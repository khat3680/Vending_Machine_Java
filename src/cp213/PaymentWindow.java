package cp213;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PaymentWindow extends JFrame {

	private VendModel model = null;

	private JButton fiveCent = new JButton("5c");
	private JButton tencent = new JButton("10c");
	private JButton twentyFive = new JButton("50c");
	private JButton one = new JButton("$1");
	private JButton two = new JButton("$2");
	private JButton five = new JButton("$5");
	private JButton ten = new JButton("$10");
	private JButton payBtn = new JButton("Pay Cash");
	private JButton payCard = new JButton("Credit/Debit Card");
	private JButton exit = new JButton("Leave");
	private JFrame compMsgBox;
	private JLabel compMsg;

	double totalPay;

	public PaymentWindow(VendModel model) {
		this.model = model;
		this.winLayout();
	}

	public void winLayout() {

		this.setMinimumSize(new Dimension(500, 350));
		this.pack();
		this.setVisible(true);
		// amnt *= 1.13;

		DecimalFormat f = new DecimalFormat("0.00");
		String decimalTotal = f.format(model.getPrice());

		JLabel totalLabel = new JLabel("Total amount: $" + decimalTotal);

		JPanel optionGrid = new JPanel();
		JPanel changeGrid = new JPanel();

		changeGrid.setLayout(new GridLayout(2, 5));
		optionGrid.setLayout(new GridLayout(5, 0));
		JTextArea cashPayment = new JTextArea();
		cashPayment.setEditable(false);
		optionGrid.add(cashPayment);

		//adding currency buttons to the grid.
		changeGrid.add(fiveCent);
		changeGrid.add(tencent);
		changeGrid.add(twentyFive);
		changeGrid.add(one);
		changeGrid.add(two);
		changeGrid.add(five);
		changeGrid.add(ten);
		
		
		//adding actions to all the currency button.
		this.fiveCent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(0.05);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.tencent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(0.10);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.twentyFive.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(0.50);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(1.00);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(2.00);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.five.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(5.00);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});
		this.ten.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				totalPay = model.getPayment(10.00);
				String newTPay = f.format(totalPay);
				cashPayment.setText("$" + newTPay);
			}
		});

		optionGrid.add(changeGrid);
		optionGrid.add(payBtn);
		optionGrid.add(payCard);
		optionGrid.add(exit);

		this.payBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				System.out.println(model.payed);

				if (totalPay < model.price) {
					compMsgBox = new JFrame();
					compMsgBox.setMinimumSize(new Dimension(200, 150));
					compMsgBox.setVisible(true);

					compMsg = new JLabel("Insufficient Funds");
					compMsgBox.setLayout(new FlowLayout());
					compMsgBox.add(compMsg);

				} else {
					double payChange = model.payTotal(totalPay);

					String change = f.format(payChange);

					compMsgBox = new JFrame();
					compMsgBox.setMinimumSize(new Dimension(300, 150));
					compMsgBox.setVisible(true);

					compMsg = new JLabel(
							"<html>Thank You For your purchase!<br/> your change is $" + change + "</html>",
							SwingConstants.CENTER);
					compMsgBox.setLayout(new FlowLayout());
					compMsgBox.add(compMsg);
				}

				System.out.println(model.payed);

			}
		});
		this.payCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(model.getPrice());

				model.payCard(model.getPrice());

				compMsgBox = new JFrame();
				compMsgBox.setMinimumSize(new Dimension(200, 150));
				compMsgBox.setVisible(true);

				compMsg = new JLabel("Thank you for your purchase");
				compMsgBox.setLayout(new FlowLayout());
				compMsgBox.add(compMsg);
			}
		});
		this.exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.clearPay();
				dispose();
			}
		});

		this.setLayout(new FlowLayout());
		this.add(totalLabel);
		this.add(optionGrid);

	}

}
