package passwordEncryptionManger;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewUser extends JFrame implements ActionListener {

	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	
	public NewUser() {
	ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image/newUser.png"));
	JLabel imgLabel = new JLabel(img);  
	imgLabel.setBounds(120, 20, 160, 160);
	add(imgLabel);
	
	JLabel l1 = new JLabel("USER NAME                 :");
	l1.setFont(new Font("Tahuma", Font.BOLD, 15));
	l1.setForeground(Color.WHITE);
	l1.setBounds(30, 190, 180, 30);
	add(l1);
	t1 = new JTextField();
	t1.setBounds(230, 190, 150, 30);
	t1.setBackground(Color.black);
	t1.setForeground(Color.white);
	t1.setFont(new Font("Tahuma",Font.BOLD ,12));
	add(t1);
	
	JLabel l2 = new JLabel("MASTER KEY               :");
	l2.setFont(new Font("Tahuma", Font.BOLD, 15));
	l2.setForeground(Color.WHITE);
	l2.setBounds(30, 235, 180, 30);
	add(l2);
	t2 = new JTextField();
	t2.setBounds(230, 235, 150, 30);
	t2.setBackground(Color.black);
	t2.setForeground(Color.white);
	t2.setFont(new Font("Tahuma",Font.BOLD ,12));
	add(t2);
	
	JLabel l3 = new JLabel("PASSWORD                  :");
	l3.setFont(new Font("Tahuma", Font.BOLD, 15));
	l3.setForeground(Color.WHITE);
	l3.setBounds(30, 280, 180, 30);
	add(l3);
	t3 = new JTextField();
	t3.setBounds(230, 280, 150, 30);
	t3.setBackground(Color.black);
	t3.setForeground(Color.white);
	t3.setFont(new Font("Tahuma",Font.BOLD ,12));
	add(t3);
	
	
	
	
	b1 = new JButton("SIGN UP");
	b1.setBounds(70, 360, 100, 40);
	b1.setForeground(Color.white);
	b1.setBackground(Color.blue);
	b1.addActionListener(this);
	add(b1);
	

	b2 = new JButton("CANCEL");
	b2.setBounds(240, 360, 100, 40);
	b2.addActionListener(this);
	add(b2);
	
	
	
	getContentPane().setBackground(Color.black);
	setLayout(null);
	setBounds(600, 190, 430, 460);
	setVisible(true);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			
		}else if(ae.getSource() == b2) {
			new WelcomePage().setVisible(true);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new NewUser();
	}

}
