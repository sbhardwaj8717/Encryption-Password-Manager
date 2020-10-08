package passwordEncryptionManger;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddData extends JFrame{

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
		l1.setBounds(350, 80, 700, 50);
		imgLab.add(l1);
		

		JLabel l2 =new  JLabel("ID / USERNAME    :");
		l2.setForeground(Color.black);
		l2.setFont(new Font("Tahuma", Font.BOLD,15));
		l2.setBounds(370, 130, 150, 50);
		imgLab.add(l2);
		
		JLabel l3 =new  JLabel("ID / USERNAME    :");
		l3.setForeground(Color.black);
		l3.setFont(new Font("Tahuma", Font.BOLD,15));
		l3.setBounds(370, 190, 150, 50);
		imgLab.add(l3);

		JLabel l4 =new  JLabel("PASSWORD     :");
		l4.setForeground(Color.black);
		l4.setFont(new Font("Tahuma", Font.BOLD,15));
		l4.setBounds(370, 250, 150, 50);
		imgLab.add(l4);
		

		JLabel l5 =new  JLabel("ID / USERNAME    :");
		l5.setForeground(Color.black);
		l5.setFont(new Font("Tahuma", Font.BOLD,15));
		l5.setBounds(370, 310, 150, 50);
		imgLab.add(l5);
		
		
		
		
		
		setLayout(null);
		setBounds(400, 200, 810, 536);
		setVisible(true);
	}

	public static void main(String[] args) {
			new AddData();
	}

}
