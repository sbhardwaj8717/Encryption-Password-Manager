package passwordEncryptionManger;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LoggedIn extends JFrame implements ActionListener{

	
<<<<<<< HEAD
	JButton b1,b2,b3,b4, imgBtn;
=======
	JButton b1,b2,b3,b4,b5,imgBtn;
>>>>>>> 781507bdeef44106e0202652ba75ffd10fca30a9
	public LoggedIn() {
		
		// SAVE PASSWORD, GET PASSWORD, VIEW ALL IN ENCRYPTION FORMAT + ORIGINAL, UPDATE CHANGES
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image/fsocity.jpg"));
		JLabel img1 = new JLabel(img);
		img1.setBounds(0, 0, 474, 474);
		add(img1);
		
		b1 = new JButton("NEW DATA");
		b1.setBounds(70, 50, 300, 40);
		b1.setBackground(new Color(220,220,220));
		b1.setOpaque(false);
		b1.setForeground(Color.red);
		b1.addActionListener(this);
		img1.add(b1);

		b2 = new JButton("GET DATA");
		b2.setBounds(70, 130, 300, 40);
		b2.setBackground(new Color(220,220,220));
		b2.setOpaque(false);
		b2.setForeground(Color.red);
		b2.addActionListener(this);
		img1.add(b2);

		b3 = new JButton("VIEW ALL");
		b3.setBounds(70, 210, 300, 40);
		b3.setBackground(new Color(220,220,220));
		b3.setOpaque(false);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		img1.add(b3);
		
		b4 = new JButton("UPDATE DATA");
		b4.setBounds(70, 290, 300, 40);
		b4.setBackground(new Color(220,220,220));
		b4.setOpaque(false);
		b4.setForeground(Color.red);
		b4.addActionListener(this);
		img1.add(b4);
		
//		b5 = new JButton("LOG OUT");
//		b5.setBounds(70, 370, 300, 40);
//		b5.setBackground(new Color(220,220,220));
//		b5.setOpaque(false);
//		b5.setForeground(Color.red);
//		b5.addActionListener(this);
//		img1.add(b5);
		
		
		ImageIcon earlAz = new ImageIcon(ClassLoader.getSystemResource("image/earlaz.png"));
<<<<<<< HEAD
		imgBtn= new JButton(earlAz);
		imgBtn.setBounds(185, 350, 70, 70);
		imgBtn.addActionListener(this);
		imgBtn.setOpaque(false);
		imgBtn.setBackground(new Color(0,0,0,0));
		imgBtn.setBorder(null);
//		earlAz1.mouseEnter(null,HAND_CURSOR , HAND_CURSOR);
=======
		imgBtn = new JButton(earlAz);
		imgBtn.setBounds(185, 350, 70, 70);
		imgBtn.addActionListener(this);
                imgBtn.setBackground(new Color(0,0,0,0));
                imgBtn.setOpaque(false);
                imgBtn.setBorder(null);
>>>>>>> 781507bdeef44106e0202652ba75ffd10fca30a9
		img1.add(imgBtn);
		
		setLayout(null);
		setBounds(550, 200, 474, 474);
		setVisible(true);
		
		
	}
	
	@Override 
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			new AddData().setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == b2) {
			
		}else if(ae.getSource() == b3) {
			
		}else if(ae.getSource() == b4) {
			
<<<<<<< HEAD
		}else if(ae.getSource() ==imgBtn) {
=======
		}else if(ae.getSource() ==  imgBtn) {
>>>>>>> 781507bdeef44106e0202652ba75ffd10fca30a9
			new WelcomePage().setVisible(true);
			this.setVisible(false);
		}
	}
	
//	public static void main(String[] args) {
//		new LoggedIn();
//	}

}
