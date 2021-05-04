package cp213;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class VendView2 extends JPanel {

	private VendModel model = null;

	// Separate JPanels
	private JPanel btnView = new JPanel();
	private JPanel btnView2 = new JPanel();
	private JPanel textView = new JPanel(new GridBagLayout());
	private JPanel msgBtnView = new JPanel(new GridBagLayout());
	private JPanel imageView = new JPanel();

	// Buttons for machine
	private final JButton showMsg = new JButton("Show Message");
	private final JButton butt1 = new JButton("A");
	private final JButton butt2 = new JButton("B");
	private final JButton butt3 = new JButton("C");
	private final JButton butt4 = new JButton("D");
	private final JButton butt5 = new JButton("E");
	private final JButton butt6 = new JButton("F");
	private final JButton butt7 = new JButton("1");
	private final JButton butt8 = new JButton("2");
	private final JButton butt9 = new JButton("3");
	private final JButton butt10 = new JButton("4");
	private final JButton butt11 = new JButton("5");
	private final JButton butt12 = new JButton("6");
	private final JButton butt13 = new JButton("7");
	private final JButton butt14 = new JButton("8");
	private final JButton butt15 = new JButton("9");
	private final JButton butt16 = new JButton("*");
	private final JButton butt17 = new JButton("0");
	private final JButton butt18 = new JButton("#");
	private final JButton butt19 = new JButton("Cash");

	// text field object
	private final TextField amount = new TextField(8);

	// imageIcon object
	private final ImageIcon prodImg = new ImageIcon(getClass().getResource("chocolate-bar-small.png"));

	public VendView2(VendModel model) {
		this.model = model;
		// your code here
		// button grid panel
		btnView.setLayout(new GridLayout(6, 3));
		btnView.add(this.butt1);
		btnView.add(this.butt2);
		btnView.add(this.butt3);
		btnView.add(this.butt4);
		btnView.add(this.butt5);
		btnView.add(this.butt6);
		btnView.add(this.butt7);
		btnView.add(this.butt8);
		btnView.add(this.butt9);
		btnView.add(this.butt10);
		btnView.add(this.butt11);
		btnView.add(this.butt12);
		btnView.add(this.butt13);
		btnView.add(this.butt14);
		btnView.add(this.butt15);
		btnView.add(this.butt16);
		btnView.add(this.butt17);
		btnView.add(this.butt18);
		
		btnView2.setLayout(new GridLayout(1,1));
		btnView2.add(this.butt19);
		
		// textBox panel
		GridBagConstraints cons = new GridBagConstraints();
		cons.gridy = 7;
		textView.add(this.amount, cons);

		// show message button panel
		showMsg.setPreferredSize(new Dimension(150, 30));
		msgBtnView.add(this.showMsg, cons);

		showMsg.addActionListener(new Action());
		

//		// image panel
		final JLabel img = new JLabel(this.prodImg);
		imageView.add(img);

		// model layout for JFrame
		this.setLayout(new FlowLayout());
		this.add(imageView);
		this.add(textView);
		this.add(msgBtnView);
		this.add(btnView);
		this.add(btnView2);
	}

	static class Action implements ActionListener {

		private final String msgTxt = "this is a test message";
		private final JLabel msg = new JLabel(this.msgTxt);
		final JPanel msgPan = new JPanel();

		public void actionPerformed(ActionEvent e) {
			final JFrame msgBox = new JFrame();
			msgBox.setMinimumSize(new Dimension(200, 200));
			msgBox.setVisible(true);

			msgPan.add(this.msg);

			msgBox.add(msgPan);
		}
	}

}
