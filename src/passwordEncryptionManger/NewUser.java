package passwordEncryptionManger;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewUser extends JFrame {

	JButton b1,b2;
	public NewUser() {

	b1 = new JButton("SIGN UP");
	b1.setBounds(100, 400, 100, 40);
	b1.setForeground(Color.white);
	b1.setBackground(Color.blue);
	add(b1);
	

	b2 = new JButton("CANCEL");
	b2.setBounds(250, 400, 100, 40);
	add(b2);
	
	ImageIcon
	
	setLayout(null);
	setBounds(200, 300, 500, 500);
	setVisible(true);
	
	}

	public static void main(String[] args) {
		new NewUser();
	}

}
