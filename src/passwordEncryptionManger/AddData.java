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
		Image img1 = img.getImage().getScaledInstance(600, 370, Image.SCALE_DEFAULT);
		ImageIcon img2 = new ImageIcon(img1);
		JLabel imgLab = new JLabel(img2);
		imgLab.setBounds(0, 0, 600, 370);
		add(imgLab);

		JLabel l1 =new  JLabel("WHAT'S    NEW..?");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Comic Sans MS", Font.ITALIC,25));
		l1.setBounds(30, 30, 700, 50);
		imgLab.add(l1);
		
		
		
		
		
		
		
		
		
		setLayout(null);
		setBounds(400, 200, 600, 370);
		setVisible(true);
	}

	public static void main(String[] args) {
			new AddData();
	}

}
