package passwordEncryptionManger;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddData extends JFrame{
	
	JTextField t1,t2,t3,t4;
	
	JButton b1,b2;

	public AddData() {
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image/pass.png"));
		Image img1 = img.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
		ImageIcon img2 = new ImageIcon(img1);
		JLabel imgLab = new JLabel(img2);
		imgLab.setBounds(0, 0, 800, 500);
		add(imgLab);

		JLabel l1 =new  JLabel("WHAT'S    NEW..?");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Comic Sans MS", Font.BOLD,25));
		l1.setBounds(340, 80, 700, 50);
		imgLab.add(l1);
		

		JLabel l2 =new  JLabel("PREFERENCE      :");
		l2.setForeground(Color.black);
		l2.setFont(new Font("Tahuma", Font.BOLD,15));
		l2.setBounds(360, 130, 150, 50);
		imgLab.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(525, 130, 240, 33);
		t1.setFont(new Font("Tahuma", Font.BOLD,15));
		imgLab.add(t1);
		
		JLabel l3 =new  JLabel("ID / USERNAME    :");
		l3.setForeground(Color.black);
		l3.setFont(new Font("Tahuma", Font.BOLD,15));
		l3.setBounds(360, 190, 150, 50);
		imgLab.add(l3);
		t2 = new JTextField();
		t2.setBounds(525, 190, 240, 33);
		t2.setFont(new Font("Tahuma", Font.BOLD,15));
		imgLab.add(t2);

		JLabel l4 =new  JLabel("PASSWORD          :");
		l4.setForeground(Color.black);
		l4.setFont(new Font("Tahuma", Font.BOLD,15));
		l4.setBounds(360, 250, 150, 50);
		imgLab.add(l4);
		t3 = new JTextField();
		t3.setBounds(525, 250, 240, 33);
		t3.setFont(new Font("Tahuma", Font.BOLD,15));
		imgLab.add(t3);
		

		JLabel l5 =new  JLabel("LINK                       :");
		l5.setForeground(Color.black);
		l5.setFont(new Font("Tahuma", Font.BOLD,15));
		l5.setBounds(360, 310, 150, 50);
		imgLab.add(l5);
		t4 = new JTextField();
		t4.setBounds(525, 310, 240, 33);
		t4.setFont(new Font("Tahuma", Font.BOLD,15));
		imgLab.add(t4);
		
		b1 = new JButton("ADD");
		b1.setBounds(400, 370, 140, 40);
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		imgLab.add(b1);

		b2 = new JButton("CANCEL");
		b2.setBounds(560, 370, 140, 40);
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		imgLab.add(b2);
		
		
		setLayout(null);
		setBounds(400, 200, 810, 536);
		setVisible(true);
	}

	public static void main(String[] args) {
			new AddData();
	}

}
