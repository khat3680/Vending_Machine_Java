package cp213;

import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Viewrack extends JPanel {
	@SuppressWarnings("unused")
	private VendModel model = null;
	public ProdObj product;

	final int PROD_QUANTITY = 5;

	// imageIcon object
	// private final ImageIcon prodImg = new
	// ImageIcon(getClass().getResource("chocolate-bar-small.png"));
	public ArrayList<ProdObj> prodList = new ArrayList<ProdObj>();
	private ImageIcon prodImage;
	private Image scaledImg;
	private JLabel img;
	private JLabel prodTag;
	private JLabel prodPrice;
	private Image newImg;
	JPanel prodPanel;

	public Viewrack(VendModel model) {
		this.model = model;

		this.layoutView();

	}

	private void layoutView() {
		this.setLayout(new GridLayout(3, 3));
		// char l = 'A';
		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("birthday.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("A0");
		prodPrice = new JLabel("$1.00");

		product = new ProdObj(prodTag.getText(), 1.00, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("breakfast.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("A1");
		prodPrice = new JLabel("$2.50");

		product = new ProdObj(prodTag.getText(), 2.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("cactus.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("A2");
		prodPrice = new JLabel("$4.50");

		product = new ProdObj(prodTag.getText(), 4.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("chililemon.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("B0");
		prodPrice = new JLabel("$2.50");

		product = new ProdObj(prodTag.getText(), 2.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("chocolate_chip.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("B1");
		prodPrice = new JLabel("$11.50");

		product = new ProdObj(prodTag.getText(), 11.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("Potato-Chips-Bag.gif"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 100, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("B2");
		prodPrice = new JLabel("$14.50");

		product = new ProdObj(prodTag.getText(), 14.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("ketchup.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 60, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("C0");
		prodPrice = new JLabel("$10.00");

		product = new ProdObj(prodTag.getText(), 10.00, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("roadhouse.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 60, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("C1");
		prodPrice = new JLabel("$3.50");

		product = new ProdObj(prodTag.getText(), 3.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		prodPanel = new JPanel();
		prodPanel.setLayout(new GridLayout(0, 3));

		prodImage = new ImageIcon(getClass().getResource("sports.jpeg"));
		scaledImg = prodImage.getImage();
		newImg = scaledImg.getScaledInstance(80, 60, Image.SCALE_SMOOTH);
		prodImage = new ImageIcon(newImg);

		img = new JLabel(prodImage);
		prodTag = new JLabel("C2");
		prodPrice = new JLabel("$1.50");

		product = new ProdObj(prodTag.getText(), 1.50, PROD_QUANTITY);

		prodPanel.add(img);
		prodPanel.add(prodTag);
		prodPanel.add(prodPrice);
		prodList.add(product);
		this.add(prodPanel);

		

	}
}
