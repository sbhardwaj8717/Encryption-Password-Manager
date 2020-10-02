package passwordEncryptionManger;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends JFrame implements ActionListener{
	
	JButton b1,b2;
	
	public WelcomePage() {
		
		JLabel j1 = new JLabel("WELCOME TO PRIVACY WORLD");
		j1.setBounds(20, 40, 700, 100);
		j1.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 40));
		j1.setForeground(Color.yellow);
		add(j1);
		
		JLabel j2 = new JLabel("Inspiered by Mr. Robot");
		j2.setBounds(50, 160, 700, 100);
		j2.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 50));
		j2.setForeground(Color.red);
		add(j2);
		
		JLabel j3 = new JLabel("samsepi0l");
		j3.setBounds(180, 260, 500, 100);
		j3.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 60));
		j3.setForeground(Color.black);
		add(j3);
		
		b1 = new JButton("NEW USER");
		b1.setBounds(100, 500, 200, 40);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.RED);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("LOGIN");
		b2.setBounds(350, 500, 200, 40);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLUE);
		b2.addActionListener(this);
		add(b2);
		
		
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image/welcome.jpg"));
		Image img2= img.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel imgLable = new JLabel(img3);
		imgLable.setBounds(0, 0, 700, 600);
		add(imgLable);
		
		
		setLayout(null);
		setBounds(500, 130, 700, 600);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			new NewUser().setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == b2) {
			new Login().setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		
		new WelcomePage();
	}

}
